package Exam;

import java.util.Scanner;

public class GrandpaStavri_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int daysN = Integer.parseInt(scanner.nextLine());

        double degreesPerLiter =0;
        double totalLiters=0;
        double averageDegrees=0;

        for (int i = 1 ; i <=daysN ;i++){
            double liters = Double.parseDouble(scanner.nextLine());
            double degrees = Double.parseDouble(scanner.nextLine());
            degreesPerLiter += liters*degrees;
            totalLiters += liters;
            averageDegrees = degreesPerLiter / totalLiters;
        }
        System.out.printf("Liter: %.2f",totalLiters);
        System.out.printf("\nDegrees: %.2f",averageDegrees);
        if (averageDegrees<38){
            System.out.println("\nNot good, you should baking!");
        } else if (averageDegrees <= 42) {
            System.out.println("\nSuper!");
        } else if (averageDegrees > 42) {
            System.out.println("\nDilution with distilled water!");
        }
    }
}
