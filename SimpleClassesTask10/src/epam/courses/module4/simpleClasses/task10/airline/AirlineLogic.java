package epam.courses.module4.simpleClasses.task10.airline;

import java.util.Arrays;

public class AirlineLogic {
    private static AirlineLogic airlineLogic;

    private AirlineLogic() {}

    public static AirlineLogic getInstance() {
        if (airlineLogic == null) {
            airlineLogic = new AirlineLogic();
        }
        return airlineLogic;
    }

    public void printAirline(Airline airline) {
        System.out.println("номер рейса: " + airline.getFlightNumber());
        System.out.println("пункт назначения: " + airline.getDestination());
        System.out.println("тип самолёта: " + airline.getAirplaneType());
        System.out.println("время вылета: " + airline.getDepartureTime());
        System.out.println("дни недели: " + Arrays.toString(airline.getDays()));
    }
}
