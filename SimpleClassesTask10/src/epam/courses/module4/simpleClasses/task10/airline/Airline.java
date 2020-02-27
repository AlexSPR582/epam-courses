package epam.courses.module4.simpleClasses.task10.airline;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Arrays;

public class Airline {
    private int flightNumber;
    private String destination;
    private String airplaneType;
    private LocalTime departureTime;
    private DayOfWeek[] days;

    public Airline(int flightNumber, String destination,
                   String airplaneType, String departureTime, DayOfWeek... days) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.airplaneType = airplaneType;
        this.departureTime = LocalTime.parse(departureTime);
        this.days = days;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = LocalTime.parse(departureTime);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public DayOfWeek[] getDays() {
        return days;
    }

    public void setDays(DayOfWeek[] days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "epam.courses.module4.simpleClasses.task10.airline.Airline{" +
                "destination=" + destination +
                ", flightNumber=" + flightNumber +
                ", airplaneType='" + airplaneType + '\'' +
                ", departureTime=" + departureTime.toString() +
                ", days=" + Arrays.toString(days) +
                '}';
    }
}
