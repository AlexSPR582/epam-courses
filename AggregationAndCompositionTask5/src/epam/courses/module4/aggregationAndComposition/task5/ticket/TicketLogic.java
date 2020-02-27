package epam.courses.module4.aggregationAndComposition.task5.ticket;

import epam.courses.module4.aggregationAndComposition.task5.ticket.nutrition.Nutrition;
import epam.courses.module4.aggregationAndComposition.task5.ticket.transport.Transport;
import epam.courses.module4.aggregationAndComposition.task5.ticket.type.TicketType;
import epam.courses.module4.aggregationAndComposition.task5.travelAgency.TravelAgency;

public class TicketLogic {
    private static TicketLogic ticketLogic;

    private TicketLogic() {}

    public static TicketLogic getInstance() {
        if (ticketLogic == null) {
            ticketLogic = new TicketLogic();
        }
        return ticketLogic;
    }

    public void createTicket(TicketType type, Transport transport, Nutrition nutrition, int days){
        TravelAgency.getInstance().getTickets().add(new Ticket(type, transport, nutrition, days));
    }

    public void printTicket(Ticket ticket) {
        System.out.println("тип: " + ticket.getTicketType());
        System.out.println("транспорт: " + ticket.getTransport());
        System.out.println("питание: " + ticket.getNutrition());
        System.out.println("количество дней: " + ticket.getDays() + '\n');
    }
}
