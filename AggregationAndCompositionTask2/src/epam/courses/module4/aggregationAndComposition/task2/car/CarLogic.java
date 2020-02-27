package epam.courses.module4.aggregationAndComposition.task2.car;

import epam.courses.module4.aggregationAndComposition.task2.wheel.Wheel;

public class CarLogic {
    private static CarLogic carLogic;

    private CarLogic() {}

    public static CarLogic getInstance() {
        if (carLogic == null) {
            carLogic = new CarLogic();
        }
        return carLogic;
    }

    public void move(int distance, Car car){
        while (distance > 0) {
            if (car.getCurrentFuel() > 0) {
                car.setCurrentFuel(car.getCurrentFuel() - 1);
                distance -= 1;
            }
            else {
                System.out.println("топливо закончилось");
                break;
            }
        }
        if (distance == 0) {
            System.out.println("машина успешно доехала до места назначения");
        }
    }

    public void changeWheel(Wheel wheel, int wheelIndex, Car car){
        if (wheel.getWidth() == car.getWheels()[wheelIndex].getWidth()
                && wheel.getDiameter() == car.getWheels()[wheelIndex].getDiameter()) {
            car.getWheels()[wheelIndex] = wheel;
            System.out.println("Колесо успешно заменено");
        }
        else {
            System.out.println("Это колесо не подходит");
        }
    }

    public void toRefuel(int fuel, Car car){
        car.setCurrentFuel(car.getCurrentFuel() + fuel);
        System.out.println("машина заправлена");
    }
}
