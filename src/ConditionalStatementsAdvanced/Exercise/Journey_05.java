package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        double finalPrice;
        String stayPlace = "";
        String destination = "";

        switch (season){
            case "summer" :
                stayPlace = "Camp";
            break;
            case "winter":
                stayPlace = "Hotel";
            break;
        }


        if (budget<=100){
            destination = "Bulgaria";
            if (season.equals("summer")){
                finalPrice = budget * 0.30;
                System.out.printf("Somewhere in %s" +
                        "\n%s - %.2f",destination,stayPlace,finalPrice);
                
            } else if (season.equals("winter")) {
                finalPrice = budget * 0.70;
                System.out.printf("Somewhere in %s" +
                        "\n%s - %.2f",destination,stayPlace,finalPrice);

            }
        } else if (budget<=1000) {
            destination = "Balkans";
            if (season.equals("summer")){
                finalPrice = budget * 0.40;
                System.out.printf("Somewhere in %s" +
                        "\n%s - %.2f",destination,stayPlace,finalPrice);

            } else if (season.equals("winter")) {
                finalPrice = budget * 0.80;
                System.out.printf("Somewhere in %s" +
                        "\n%s - %.2f",destination,stayPlace,finalPrice);

            }
            
        } else if (budget>1000) {
            destination = "Europe";
            stayPlace = "Hotel";
            finalPrice = budget * 0.90;
            System.out.printf("Somewhere in %s" +
                    "\n%s - %.2f",destination,stayPlace,finalPrice);
        }


    }
}
