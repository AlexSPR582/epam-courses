package epam.courses.module5.basicsOfOOP.task3.main;

/*Создать класс Календарь с внутренним классом, с помощью объектов которого можно хранить информацию о
выходных и праздничных днях. */

import epam.courses.module5.basicsOfOOP.task3.celendar.Calendar;
import epam.courses.module5.basicsOfOOP.task3.celendar.CalendarLogic;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        Calendar.Weekends weekends = calendar.new Weekends();
        CalendarLogic cl = CalendarLogic.getInstance();

        cl.addWeekend("2020-05-17", weekends);
        cl.addWeekend("2020-04-18", weekends);
        cl.addWeekend("2020-08-01", weekends);
        cl.addWeekend("2020-07-14", weekends);

        cl.printAllWeekends(weekends);
    }
}
