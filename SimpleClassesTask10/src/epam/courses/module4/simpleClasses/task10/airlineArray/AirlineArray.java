package epam.courses.module4.simpleClasses.task10.airlineArray;

import epam.courses.module4.simpleClasses.task10.airline.Airline;

public class AirlineArray {
    private Airline[] airlines;

    public AirlineArray(Airline[] airlines){
        this.airlines = airlines;
    }

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    public Airline[] getAirlines() {
        return airlines;
    }
}
