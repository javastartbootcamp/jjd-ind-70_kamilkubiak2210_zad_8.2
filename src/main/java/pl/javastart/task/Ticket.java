package pl.javastart.task;

import java.util.Scanner;

public class Ticket {
    private String eventName;
    private Address address;
    private String type;
    private int price;
    private double discount;
    protected static int ID = 0;

    public Ticket() {
    }

    public Ticket(String eventName, Address address, String type, int price, double discount, int id) {
        this.eventName = eventName;
        this.address = address;
        this.type = type;
        this.price = price;
        this.discount = discount;
        ID = id;
    }

    public double calculatePrice() {
        double finalPrice = price * (1 - discount);
        return switch (type) {
            case "Online", "online" -> finalPrice;
            case "Standard", "standard" -> finalPrice + 5;
            case "Gift", "gift" -> finalPrice + 5 + (finalPrice * 0.05);
            default -> finalPrice;
        };
    }

    void printTicket(double finalPrice) {
        System.out.println("Bilet " + type + ": cena podstawowa " + price + ", zniżka " + (int) (discount * 100) + "%"
                + ", cena finalna wyniesie " + finalPrice + " zł");
        ID++;
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
        price = 100;
        discount = 0.05;
        ID++;

        return new Ticket(eventName, new Address(street, number), type, price, discount, ID);
    }
}

