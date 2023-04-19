package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Ticket ticket1 = new Ticket("Cyrk", new Address("Kozłowskiego", 4), Ticket.TYPE_ONLINE, 100, 0.05);
        double ticket1FinalPrice = ticket1.calculatePrice();

        Ticket ticket2 = new Ticket("Koncert", new Address("Mielna", 11), Ticket.TYPE_STANDARD, 100, 0.05);
        double ticket2FinalPrice = ticket2.calculatePrice();

        Ticket ticket3 = new Ticket("Teatr", new Address("Jana", 33), Ticket.TYPE_GIFT, 100, 0.05);
        double ticket3FinalPrice = ticket3.calculatePrice();

        Ticket ticket4 = new Ticket();
        Ticket ticket4Ticket = ticket4.createTicket();
        double ticket4FinalPrice = ticket4Ticket.calculatePrice();

        ticket1.printTicket(ticket1FinalPrice);
        ticket2.printTicket(ticket2FinalPrice);
        ticket3.printTicket(ticket3FinalPrice);
        ticket4.printTicket(ticket4FinalPrice);

    }
}
