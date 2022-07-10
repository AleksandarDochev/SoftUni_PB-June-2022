package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class SummerOutfit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int celsius = Integer.parseInt(scanner.nextLine());
        String dayTime = scanner.nextLine();
        String Outfit ="";
        String Shoes ="";

        if (dayTime.equals("Morning")){
            if (celsius >=10 && celsius<=18){
                Outfit ="Sweatshirt";
                Shoes ="Sneakers";
            } else if (celsius > 18 && celsius <=24) {
                Outfit ="Shirt";
                Shoes ="Moccasins";
            } else if (celsius >=25) {
                Outfit ="T-Shirt";
                Shoes ="Sandals";
            }
        } else if (dayTime.equals("Afternoon")) {
            if (celsius >=10 && celsius<=18){
                Outfit ="Shirt";
                Shoes ="Moccasins";
            } else if (celsius > 18 && celsius <=24) {
                Outfit ="T-Shirt";
                Shoes ="Sandals";
            } else if (celsius >=25) {
                Outfit ="Swim Suit";
                Shoes ="Barefoot";
            }

        } else if (dayTime.equals("Evening")) {
            if (celsius >= 10 && celsius <= 18) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            } else if (celsius > 18 && celsius <= 24) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            } else if (celsius >= 25) {
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.",celsius,Outfit,Shoes);

    }
}
