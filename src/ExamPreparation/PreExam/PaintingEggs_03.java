package ExamPreparation.PreExam;

import java.util.Scanner;

public class PaintingEggs_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String size = scanner.nextLine();
        String colour = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        double priceEgg = 0;

            if (size.equals("Large")) {
                if (colour.equals("Red")) {
                    priceEgg += 16;
                } else if (colour.equals("Green")) {
                    priceEgg += 12;
                } else if (colour.equals("Yellow")) {
                    priceEgg += 9;
                }
            }
            if (size.equals("Medium")) {
                if (colour.equals("Red")) {
                    priceEgg += 13;
                } else if (colour.equals("Green")) {
                    priceEgg += 9;
                } else if (colour.equals("Yellow")) {
                    priceEgg += 7;
                }
            }
            if (size.equals("Small")) {
                if (colour.equals("Red")) {
                    priceEgg += 9;
                } else if (colour.equals("Green")) {
                    priceEgg += 8;
                } else if (colour.equals("Yellow")) {
                    priceEgg += 5;
                }
            }

        double eggAllPrice = count*priceEgg;
        double expenses = 0.35 * eggAllPrice;
        double priceFinal = eggAllPrice - expenses;

        System.out.printf("%.2f leva.",priceFinal);



    }
}
