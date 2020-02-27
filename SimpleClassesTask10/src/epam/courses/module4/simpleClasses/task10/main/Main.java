package epam.courses.module4.simpleClasses.task10.main;
/*
10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа epam.courses.module4.simpleClasses.task10.airline.Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */

import epam.courses.module4.simpleClasses.task10.airline.Airline;
import epam.courses.module4.simpleClasses.task10.airlineArray.AirlineArray;
import epam.courses.module4.simpleClasses.task10.airlineArray.AirlineArrayLogic;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        Airline airline1 = new Airline(345, "Минск", "Airbus A310",
                "14:40", DayOfWeek.FRIDAY, DayOfWeek.TUESDAY);
        Airline airline2 = new Airline(934, "Москва", "Boeing-747",
                "18:50", DayOfWeek.WEDNESDAY, DayOfWeek.SUNDAY);
        Airline airline3 = new Airline(745, "Вашингтон", "Boeing-777",
                "16:20", DayOfWeek.FRIDAY, DayOfWeek.WEDNESDAY);

        Airline[] airlines = {airline1, airline2, airline3};
        AirlineArray airlineArray = new AirlineArray(airlines);
        AirlineArrayLogic aal = AirlineArrayLogic.getInstance();

        System.out.println("Список рейсов для заданного пункта назначения:");
        aal.printAirlinesByDestination("Минск", airlineArray);

        System.out.println('\n' + "Список рейсов для заданного дня недели:");
        aal.printAirlineByDayOfTheWeek(DayOfWeek.WEDNESDAY, airlineArray);

        System.out.println('\n' + "Список рейсов для заданного дня недели, после указанного времени:");
        aal.printAirlineByDayOfTheWeekAfterTime(DayOfWeek.FRIDAY, "15:00", airlineArray);
    }
}
