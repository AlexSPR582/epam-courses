package epam.courses.module4.simpleClasses.task6.main;

import epam.courses.module4.simpleClasses.task6.time.Time;
import epam.courses.module4.simpleClasses.task6.time.TimeLogic;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(6, 40, 30);
        TimeLogic tl = TimeLogic.getInstance();
        tl.printTime(time);

        tl.increaseHours(5, time);
        tl.printTime(time);

        tl.increaseMinutes(20, time);
        tl.printTime(time);

        tl.increaseSeconds(10, time);
        tl.printTime(time);

        tl.reduceHours(2, time);
        tl.printTime(time);

        tl.reduceMinutes(40, time);
        tl.printTime(time);

        tl.reduceSeconds(50, time);
        tl.printTime(time);

    }
}
