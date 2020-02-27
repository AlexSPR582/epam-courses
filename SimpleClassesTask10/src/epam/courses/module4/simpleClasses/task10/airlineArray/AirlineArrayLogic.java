package epam.courses.module4.simpleClasses.task10.airlineArray;

import epam.courses.module4.simpleClasses.task10.airline.Airline;
import epam.courses.module4.simpleClasses.task10.airline.AirlineLogic;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class AirlineArrayLogic {
    private static AirlineArrayLogic airlineArrayLogic;

    private AirlineArrayLogic() {}

    public static AirlineArrayLogic getInstance() {
        if (airlineArrayLogic == null) {
            airlineArrayLogic = new AirlineArrayLogic();
        }
        return airlineArrayLogic;
    }

    public void printAirlinesByDestination(String destination, AirlineArray airlines){
        for (Airline airline: airlines.getAirlines()){
            if (airline.getDestination().equals(destination)){
                AirlineLogic.getInstance().printAirline(airline);
            }
        }
    }

    public void printAirlineByDayOfTheWeek(DayOfWeek dayOfWeek, AirlineArray airlines){
        for (Airline airline: airlines.getAirlines()){
            for (DayOfWeek day: airline.getDays()) {
                if (dayOfWeek.equals(day)) {
                    AirlineLogic.getInstance().printAirline(airline);
                }
            }
        }
    }

    public void printAirlineByDayOfTheWeekAfterTime(DayOfWeek dayOfWeek, String time, AirlineArray airlines){
        LocalTime time1 = LocalTime.parse(time);
        for (Airline airline: airlines.getAirlines()){
            for (DayOfWeek day: airline.getDays()) {
                if (dayOfWeek.equals(day) && airline.getDepartureTime().isAfter(time1)) {
                    AirlineLogic.getInstance().printAirline(airline);
                }
            }
        }
    }
}
