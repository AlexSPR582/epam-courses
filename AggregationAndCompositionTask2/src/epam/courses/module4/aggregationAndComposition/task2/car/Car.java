package epam.courses.module4.aggregationAndComposition.task2.car;

import epam.courses.module4.aggregationAndComposition.task2.carException.DifferentWheelsException;
import epam.courses.module4.aggregationAndComposition.task2.carException.NotEnoughWheelsException;
import epam.courses.module4.aggregationAndComposition.task2.carException.OddNumberOfWheelsException;
import epam.courses.module4.aggregationAndComposition.task2.engine.Engine;
import epam.courses.module4.aggregationAndComposition.task2.wheel.Wheel;

public class Car {
    private String model;
    private Wheel[] wheels;
    private Engine engine;
    private int currentFuel = 0;

    public Car(String model, Engine engine, Wheel... wheels){
        this.model = model;
        this.engine = engine;
        if (wheelsValidation(wheels)) {
            this.wheels = wheels;
        }
    }

    public Car(String model, Engine engine, int currentFuel, Wheel... wheels) {
        this.model = model;
        this.engine = engine;
        this.currentFuel = currentFuel;
        if (wheelsValidation(wheels)) {
            this.wheels = wheels;
        }
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(int currentFuel) {
        this.currentFuel = currentFuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        if (wheelsValidation(wheels)) {
            this.wheels = wheels;
        }
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private boolean wheelsValidation(Wheel[] wheels) {
        if (wheels.length < 4) {
            throw new NotEnoughWheelsException();
        }
        else if (wheels.length % 2 != 0) {
            throw new OddNumberOfWheelsException();
        }
        for (Wheel wheel : wheels) {
            if (wheel.getDiameter() != wheels[0].getDiameter()
                    || wheel.getWidth() != wheels[0].getWidth()) {
                throw new DifferentWheelsException();
            }
        }
        return true;
    }
}
