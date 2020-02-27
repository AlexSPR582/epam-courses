package epam.courses.module4.aggregationAndComposition.task2.engine;

public class Engine {
    private int enginePower;
    private int torque;
    private EngineType engineType;


    public Engine(int enginePower, int torque, EngineType engineType) {
        this.enginePower = enginePower;
        this.torque = torque;
        this.engineType = engineType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
