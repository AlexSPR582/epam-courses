package epam.courses.module4.simpleClasses.task5.counter;

public class CounterLogic {
    private static CounterLogic counterLogic;

    private CounterLogic() {}

    public static CounterLogic getInstance() {
        if (counterLogic == null) {
            counterLogic = new CounterLogic();
        }
        return counterLogic;
    }

    public void increaseCounter(Counter counter){
        if (counter.getValue() < counter.getRightRange()){
            counter.setValue(counter.getValue() + 1);
        }
    }

    public void reduceCounter(Counter counter){
        if (counter.getValue() > counter.getLeftRange()){
            counter.setValue(counter.getValue() - 1);
        }
    }
}
