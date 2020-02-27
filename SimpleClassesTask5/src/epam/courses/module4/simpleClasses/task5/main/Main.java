package epam.courses.module4.simpleClasses.task5.main;

import epam.courses.module4.simpleClasses.task5.counter.Counter;
import epam.courses.module4.simpleClasses.task5.counter.CounterLogic;

public class Main {
    public static void main(String[] args) {
        CounterLogic cl = CounterLogic.getInstance();
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(4, -20, 20);
        System.out.println("Значение первого счётчика: " + counter1.getValue());
        System.out.println("Значение второго счётчика: " + counter2.getValue());

        System.out.println('\n' + "Увеличение значения первого счётчика на 1");
        cl.increaseCounter(counter1);
        System.out.println("Значение первого счётчика: " + counter1.getValue());

        System.out.println('\n' + "Уменьшение значения второго счётчика на 1");
        cl.reduceCounter(counter2);
        System.out.println("Значение второго счётчика: " + counter2.getValue());
    }
}
