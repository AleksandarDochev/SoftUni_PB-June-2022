package ConditionalStatements.Exercise;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vecationPrice = Double.parseDouble(scanner.nextLine());
        int puzelNum = Integer.parseInt(scanner.nextLine());
        int dollNum = Integer.parseInt(scanner.nextLine());
        int teddyBearsNum = Integer.parseInt(scanner.nextLine());
        int minionsNum = Integer.parseInt(scanner.nextLine());
        int toyTrucksNum = Integer.parseInt(scanner.nextLine());

        double puzelPrice = 2.60 * puzelNum;
        double dollPrice = 3.00 * dollNum;
        double tedyBearPrice = 4.10 * teddyBearsNum;
        double minionPrice = 8.20 * minionsNum;
        double TruckPrice = 2.00 * toyTrucksNum;


        int allToyNum = puzelNum+dollNum+teddyBearsNum+minionsNum+toyTrucksNum;
        double allToyPrice = puzelPrice+dollPrice+tedyBearPrice+minionPrice+TruckPrice;

        if (allToyNum >= 50) {
            allToyPrice = allToyPrice - (allToyPrice * 0.25);
        }

        allToyPrice = allToyPrice - (allToyPrice * 0.10);
        if (allToyPrice >= vecationPrice){
            System.out.printf("Yes! %.2f lv left.",allToyPrice-vecationPrice);
        }else {
            System.out.printf("Not enough money! %.2f lv needed.",vecationPrice-allToyPrice);
        }
    }
}
