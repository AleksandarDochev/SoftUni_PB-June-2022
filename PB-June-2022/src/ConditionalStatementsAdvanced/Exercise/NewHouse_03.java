package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String KindFlowers = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int buget = Integer.parseInt(scanner.nextLine());

        double priceRoses = 5.00;
        double priceDahlias = 3.80;
        double priceTulips = 2.80;
        double priceNarciss = 3.00;
        double priceGladous = 2.50;
        double price = 0;

        switch (KindFlowers){
            case "Roses":
                price = count * priceRoses;
                if (count >80){
                    price = price - (price * 0.10);
                }
                break;
            case "Dahlias":
                price = count * priceDahlias;
                if (count >90){
                    price = price - (price * 0.15);
                }
                break;
            case "Tulips":
                price = count * priceTulips;
                if (count >80){
                    price = price - (price * 0.15);
                }
                break;
            case "Narcissus":
                price = count * priceNarciss;
                if (count <120){
                    price = price + (price * 0.15);
                }
                break;
            case "Gladiolus":
                price = count * priceGladous;
                if (count <80){
                    price = price + (price * 0.20);
                }
                break;
        }
        if (price <= buget){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",count,KindFlowers,buget-price);
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.",price-buget);
        }

    }
}
