package pl.javastart.task;

import java.util.Scanner;

public class Ticket {
    public static final String TYPE_ONLINE = "online";
    public static final String TYPE_STANDARD = "standard";
    public static final String TYPE_GIFT = "gift";
    private int id;
    private String eventName;
    private Address address;
    private String type;
    private int price;
    private double discount;

    private static int ticketCounter = 0;

    public Ticket() {
    }

    public Ticket(String eventName, Address address, String type, int price, double discount) {
        this.eventName = eventName;
        this.address = address;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.id = ++ticketCounter;
    }

    public double calculatePrice() {
        double onlinePrice = price * (1 - discount);
        double standardPrice = onlinePrice + 5;
        return switch (type.toLowerCase()) {
            case TYPE_ONLINE -> onlinePrice;
            case TYPE_STANDARD -> standardPrice;
            case TYPE_GIFT -> standardPrice + (onlinePrice * 0.05);
            default -> onlinePrice;
        };
    }

    void printTicket(double finalPrice) {
        System.out.println("Bilet " + type + ": " + eventName + ", ul." + address.getStreet() + " " + address.getNumber()
                + ", cena podstawowa " + price + ", zniżka " + (int) (discount * 100) + "%" + ", cena finalna wyniesie "
                + finalPrice + " zł " + "id: " + id);
    }

    public Ticket createTicket() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz typ biletu(Online,Standard,Gift)");
        type = sc.nextLine();
        System.out.println("Podaj nazwę wydarzenia");
        eventName = sc.nextLine();
        System.out.println("Podaj miejsce, w którym się odbywa");
        System.out.println("Podaj ulice");
        String street = sc.nextLine();
        System.out.println("Podaj numer domu/mieszkania/obiektu");
        int number = sc.nextInt();
        address = new Address(street, number);
        price = 100;
        discount = 0.05;
        this.id = ++ticketCounter;
        return new Ticket(eventName, address, type, price, discount);
    }
}

