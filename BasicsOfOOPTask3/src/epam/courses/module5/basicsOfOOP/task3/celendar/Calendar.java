package epam.courses.module5.basicsOfOOP.task3.celendar;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.HashSet;
import java.util.Set;

public class Calendar {
    public class Weekends {
        private Set<LocalDate> weekends = new HashSet<>();

        public Set<LocalDate> getWeekends() {
            return weekends;
        }

        public void setWeekends(Set<LocalDate> weekends) {
            this.weekends = weekends;
        }
    }

    public DayOfWeek getDayOfWeek(String date) {
        return LocalDate.parse(date).getDayOfWeek();
    }

    public Month getMonth(String date) {
        return LocalDate.parse(date).getMonth();
    }
}
