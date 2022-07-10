package ConditionalStatements.Exercise;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double buget = Double.parseDouble(scanner.nextLine());
        int statistNum = Integer.parseInt(scanner.nextLine());
        double statistClothPrice = Double.parseDouble(scanner.nextLine());
        if (statistNum > 150) {
            statistClothPrice = statistClothPrice - (statistClothPrice *0.10);
        }
        double decor = buget * 0.10;
        double statistClothPriceFinal = statistClothPrice *statistNum;
        double expenses = decor + statistClothPriceFinal;
        if (buget >= expenses){
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.",buget-expenses);
        }else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.",expenses-buget);
        }

    }
}
