package epam.courses.module4.aggregationAndComposition.task5.travelAgency;

import epam.courses.module4.aggregationAndComposition.task5.ticket.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency {
    private static TravelAgency travelAgency;

    private List<Ticket> tickets;

    private TravelAgency(){
        this.tickets = new ArrayList<>();
    }

    public static TravelAgency getInstance(){
        if (travelAgency == null){
            travelAgency = new TravelAgency();
        }
        return travelAgency;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
