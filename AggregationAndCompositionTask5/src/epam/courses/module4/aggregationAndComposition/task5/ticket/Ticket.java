package epam.courses.module4.aggregationAndComposition.task5.ticket;

import epam.courses.module4.aggregationAndComposition.task5.ticket.nutrition.Nutrition;
import epam.courses.module4.aggregationAndComposition.task5.ticket.transport.Transport;
import epam.courses.module4.aggregationAndComposition.task5.ticket.type.TicketType;

public class Ticket {
    private TicketType type;
    private Transport transport;
    private Nutrition nutrition;
    private int days;

    public Ticket(TicketType type, Transport transport, Nutrition nutrition, int days) {
        this.type = type;
        this.transport = transport;
        this.nutrition = nutrition;
        this.days = days;
    }

    public TicketType getTicketType() {
        return type;
    }

    public Transport getTransport() {
        return transport;
    }

    public Nutrition getNutrition() {
        return nutrition;
    }

    public int getDays() {
        return days;
    }

    public void setTicketType(TicketType type) {
        this.type = type;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public void setNutrition(Nutrition nutrition) {
        this.nutrition = nutrition;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "epam.courses.module4.aggregationAndComposition.task5.ticket.Ticket{" +
                "type='" + type + ' ' +
                ", transport='" + transport + ' ' +
                ", food='" + nutrition + ' ' +
                ", days=" + days +
                '}';
    }
}
