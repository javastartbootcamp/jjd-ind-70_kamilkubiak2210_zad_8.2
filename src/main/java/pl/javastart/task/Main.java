package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Ticket ticket1 = new Ticket("Cyrk", new Address("Kozłowskiego", 4), "Online", 100, 0.05, Ticket.ID);
        double ticket1FinalPrice = ticket1.calculatePrice();
        ticket1.printTicket(ticket1FinalPrice);

        Ticket ticket2 = new Ticket("Koncert", new Address("Mielna", 11), "Standard", 100, 0.05, Ticket.ID);
        double ticket2FinalPrice = ticket2.calculatePrice();
        ticket2.printTicket(ticket2FinalPrice);

        Ticket ticket3 = new Ticket("Teatr", new Address("Jana", 33), "Gift", 100, 0.05, Ticket.ID);
        double ticket3FinalPrice = ticket3.calculatePrice();
        ticket3.printTicket(ticket3FinalPrice);

        Ticket ticket4 = new Ticket();
        Ticket ticket4Ticket = ticket4.createTicket();
        double ticket4FinalPrice = ticket4Ticket.calculatePrice();
        ticket4.printTicket(ticket4FinalPrice);
    }
}
