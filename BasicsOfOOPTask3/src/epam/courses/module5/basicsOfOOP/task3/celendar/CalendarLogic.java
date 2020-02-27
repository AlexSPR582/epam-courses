package epam.courses.module5.basicsOfOOP.task3.celendar;

import java.time.LocalDate;

public class CalendarLogic {
    private static CalendarLogic calendarLogic;

    private CalendarLogic() {}

    public static CalendarLogic getInstance() {
        if (calendarLogic == null) {
            calendarLogic = new CalendarLogic();
        }
        return calendarLogic;
    }

    public void printAllWeekends(Calendar.Weekends weekends) {
        for (LocalDate weekend: weekends.getWeekends()) {
            System.out.println(weekend);
        }
    }

    public void addWeekend(String date, Calendar.Weekends weekends) {
        LocalDate weekend = LocalDate.parse(date);
        weekends.getWeekends().add(weekend);
    }
}
