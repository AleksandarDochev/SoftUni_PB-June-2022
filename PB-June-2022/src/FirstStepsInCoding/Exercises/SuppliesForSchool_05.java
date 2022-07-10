package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NumPacketPens = Integer.parseInt(scanner.nextLine());
        int NumPacketMarkers = Integer.parseInt(scanner.nextLine());
        int LitersCleaningAgent = Integer.parseInt(scanner.nextLine());
        double Discount = Double.parseDouble(scanner.nextLine());
        double PriceAllStuff = (NumPacketPens * 5.80) +
                               (NumPacketMarkers * 7.20)  +
                               (LitersCleaningAgent * 1.20);
        double WholeDiscount = PriceAllStuff * Discount/100;
        double WholeDiscountPlusPriceAllStuff = PriceAllStuff - WholeDiscount;
        System.out.println(WholeDiscountPlusPriceAllStuff);
    }
}
