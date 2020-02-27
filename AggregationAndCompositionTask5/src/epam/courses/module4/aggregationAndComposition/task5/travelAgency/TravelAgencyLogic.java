package epam.courses.module4.aggregationAndComposition.task5.travelAgency;

import epam.courses.module4.aggregationAndComposition.task5.ticket.Ticket;
import epam.courses.module4.aggregationAndComposition.task5.ticket.TicketLogic;
import epam.courses.module4.aggregationAndComposition.task5.ticket.nutrition.Nutrition;
import epam.courses.module4.aggregationAndComposition.task5.ticket.transport.Transport;
import epam.courses.module4.aggregationAndComposition.task5.ticket.type.TicketType;

import java.util.Comparator;

public class TravelAgencyLogic {
    private static TravelAgencyLogic travelAgencyLogic;

    private TravelAgencyLogic() {}

    public static TravelAgencyLogic getInstance() {
        if (travelAgencyLogic == null) {
            travelAgencyLogic = new TravelAgencyLogic();
        }
        return travelAgencyLogic;
    }

    public void findTickets(TicketType type, Transport transport, Nutrition nutrition, int days){
        for (Ticket ticket: TravelAgency.getInstance().getTickets()){
            if (type.equals(ticket.getTicketType()) && transport.equals(ticket.getTransport()) &&
                    nutrition.equals(ticket.getNutrition()) && days == ticket.getDays()){
                TicketLogic.getInstance().printTicket(ticket);
            }
        }
    }

    public void findTickets(TicketType type) {
        for (Ticket ticket: TravelAgency.getInstance().getTickets()) {
            if (ticket.getTicketType().equals(type)) {
                TicketLogic.getInstance().printTicket(ticket);
            }
        }
    }

    public void findTickets(Transport transport) {
        for (Ticket ticket: TravelAgency.getInstance().getTickets()) {
            if (ticket.getTransport().equals(transport)) {
                TicketLogic.getInstance().printTicket(ticket);
            }
        }
    }

    public void findTickets(Nutrition nutrition) {
        for (Ticket ticket: TravelAgency.getInstance().getTickets()) {
            if (ticket.getNutrition().equals(nutrition)) {
                TicketLogic.getInstance().printTicket(ticket);
            }
        }
    }

    public void findTickets(int days) {
        for (Ticket ticket: TravelAgency.getInstance().getTickets()) {
            if (ticket.getDays() == days) {
                TicketLogic.getInstance().printTicket(ticket);
            }
        }
    }

    public void sortTicketsByDays(){
        Comparator<Ticket> comparator = new Comparator<Ticket>() {
            @Override
            public int compare(Ticket ticket1, Ticket ticket2) {
                return ticket1.getDays() - ticket2.getDays();
            }
        };
        TravelAgency.getInstance().getTickets().sort(comparator);
    }

    public void printAllTickets(){
        for (Ticket ticket: TravelAgency.getInstance().getTickets()){
            TicketLogic.getInstance().printTicket(ticket);
            System.out.println();
        }
    }
}
