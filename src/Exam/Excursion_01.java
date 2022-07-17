package Exam;

import java.util.Scanner;

public class Excursion_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int peopleNum = Integer.parseInt(scanner.nextLine());
        int nightsNum = Integer.parseInt(scanner.nextLine());
        int cardsNum = Integer.parseInt(scanner.nextLine());
        int ticketsNum = Integer.parseInt(scanner.nextLine());

        double nightPrice=20.00;
        double cardsPrice=1.60;
        double ticketsPrice=6.00;

        double priceAllNights=nightsNum*nightPrice;
        double priceAllCards=cardsNum*cardsPrice;
        double priceAllTickets=ticketsNum*ticketsPrice;

        double priceTotal=priceAllCards+priceAllTickets+priceAllNights;

        double wholeGroupePrice=priceTotal *peopleNum;
        double expenses=wholeGroupePrice+(wholeGroupePrice*0.25);
        System.out.printf("%.2f",expenses);

    }
}
