package Exam;

import java.util.Scanner;

public class SantasHoliday_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int daysStay = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String rating = scanner.nextLine();

        double priceRoom = 0;
        double endPrice;
        int nights = daysStay-1;


        switch (typeRoom){

            case "room for one person":
                priceRoom = 18.00;
                break;
            case "apartment":
                priceRoom = 25.00;
                break;

            case "president apartment":
                priceRoom = 35.00;
                break;
        }
        endPrice = priceRoom * nights;

        endPrice = priceRoom * nights;

        if (typeRoom.equals("apartment")){
            if (daysStay<10){
                endPrice = endPrice - (endPrice* 0.30);
            } else if (daysStay <= 15) {
                endPrice = endPrice - (endPrice* 0.35);
            } else {
                endPrice = endPrice - (endPrice* 0.50);
            }
        } else if (typeRoom .equals("president apartment")) {
            if (daysStay<10){
                endPrice = endPrice - (endPrice* 0.10);
            } else if (daysStay <= 15) {
                endPrice = endPrice - (endPrice* 0.15);
            } else {
                endPrice = endPrice - (endPrice* 0.20);
            }
        }


        if (rating.equals("positive")){
            System.out.printf("%.2f",endPrice + (endPrice * 0.25));
        } else if (rating.equals("negative")) {
            System.out.printf("%.2f",endPrice - (endPrice * 0.10));
        }

    }
}
