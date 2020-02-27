package epam.courses.module4.aggregationAndComposition.task2.main;

/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.*/

import epam.courses.module4.aggregationAndComposition.task2.car.Car;
import epam.courses.module4.aggregationAndComposition.task2.car.CarLogic;
import epam.courses.module4.aggregationAndComposition.task2.engine.Engine;
import epam.courses.module4.aggregationAndComposition.task2.engine.EngineType;
import epam.courses.module4.aggregationAndComposition.task2.wheel.Wheel;

public class Main {
    public static void main(String[] args) {
        Wheel wheel1 = new Wheel(50, 20);
        Wheel wheel2 = new Wheel(50, 20);
        Wheel wheel3 = new Wheel(50, 20);
        Wheel wheel4 = new Wheel(50, 20);

        Engine engine = new Engine(700, 1200, EngineType.PETROL);

        Car car = new Car("Ferrari", engine, 200,  wheel1, wheel2, wheel3, wheel4);
        CarLogic cl = CarLogic.getInstance();

        System.out.println("текущее топливо до поездки: " + car.getCurrentFuel());
        cl.move(92, car);
        System.out.println("текущее топливо после поездки: " + car.getCurrentFuel());

        System.out.println('\n' + "текущее топливо до заправки: " + car.getCurrentFuel());
        cl.toRefuel(100, car);
        System.out.println("текущее топливо после заправки: " + car.getCurrentFuel());

        System.out.println('\n' + "замена колеса: ");
        Wheel wheel5 = new Wheel(60, 20);
        cl.changeWheel(wheel5, 2, car);
        Wheel wheel6 = new Wheel(50, 20);
        cl.changeWheel(wheel6, 2, car);
    }
}
