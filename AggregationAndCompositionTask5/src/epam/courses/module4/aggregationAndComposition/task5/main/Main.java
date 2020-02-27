package epam.courses.module4.aggregationAndComposition.task5.main;

/*5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
     различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать
     возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.*/

import epam.courses.module4.aggregationAndComposition.task5.ticket.TicketLogic;
import epam.courses.module4.aggregationAndComposition.task5.ticket.nutrition.Nutrition;
import epam.courses.module4.aggregationAndComposition.task5.ticket.transport.Transport;
import epam.courses.module4.aggregationAndComposition.task5.ticket.type.TicketType;
import epam.courses.module4.aggregationAndComposition.task5.travelAgency.TravelAgencyLogic;

public class Main {
    public static void main(String[] args) {
        TicketLogic tl = TicketLogic.getInstance();
        tl.createTicket(TicketType.CRUISE, Transport.SHIP, Nutrition.BREAKFAST_LUNCH_DINER, 30);
        tl.createTicket(TicketType.EXCURSIONS, Transport.BUS, Nutrition.NOTHING, 1);
        tl.createTicket(TicketType.LEISURE, Transport.AIRPLANE, Nutrition.BREAKFAST_DINNER, 14);
        tl.createTicket(TicketType.SHOPPING, Transport.BUS, Nutrition.NOTHING, 1);
        tl.createTicket(TicketType.TREATMENT, Transport.TRAIN, Nutrition.BREAKFAST_LUNCH_DINER, 60);

        TravelAgencyLogic tal = TravelAgencyLogic.getInstance();

        System.out.println("СОРТИРОВКА ПУТЁВОК ПО КОЛИЧЕСТВУ ДНЕЙ:" + '\n');
        tal.sortTicketsByDays();
        tal.printAllTickets();

        System.out.println("ПОИСК ПУТЁВКИ ПО КОЛИЧЕСТВУ ДНЕЙ:");
        tal.findTickets(14);

        System.out.println("ПОИСК ПУТЁВКИ ПО ТИПУ:" + '\n');
        tal.findTickets(TicketType.EXCURSIONS);

        System.out.println("ПОИСК ПУТЁВКИ ПО ТИПУ ПИТАНИЯ:" + '\n');
        tal.findTickets(Nutrition.BREAKFAST_LUNCH_DINER);

        System.out.println("ПОИСК ПУТЁВКИ ПО ТИПУ ТРАНСПОРТА:" + '\n');
        tal.findTickets(Transport.AIRPLANE);

        System.out.println("ПОИСК ПУТЁВКИ ПО ВСЕМ ПАРАМЕТРАМ:" + '\n');
        tal.findTickets(TicketType.SHOPPING, Transport.BUS, Nutrition.NOTHING, 1);
    }
}
