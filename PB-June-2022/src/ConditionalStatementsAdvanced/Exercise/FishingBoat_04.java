package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int group = Integer.parseInt(scanner.nextLine());
        double priceShip = 0;
//        Цената зависи от сезона:
//•	Цената за наем на кораба през пролетта е  3000 лв.
//•	Цената за наем на кораба през лятото и есента е  4200 лв.
//•	Цената за наем на кораба през зимата е  2600 лв.

        if (season.equals("Spring")){
            priceShip = 3000;

        } else if (season.equals("Summer")) {
            priceShip = 4200;
            
        } else if (season.equals("Autumn")) {
            priceShip = 4200;
            
        } else if (season.equals("Winter")) {
            priceShip = 2600;
            //•	Ако групата е до 6 човека включително  –  отстъпка от 10%.
//•	Ако групата е от 7 до 11 човека включително  –  отстъпка от 15%.
//•	Ако групата е от 12 нагоре  –  отстъпка от 25%.
        }
        if (group <= 6){
            priceShip = priceShip -(priceShip *0.10);
        } else if (group <= 11) {
            priceShip = priceShip -(priceShip *0.15);
        } else if (group >12) {
            priceShip = priceShip -(priceShip *0.25);
        }
        //Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако
        // не е есен - тогава нямат допълнителна отстъпка.
        if (group % 2 ==0 && !season.equals("Autumn")){
            priceShip =priceShip -(priceShip * 0.05);
        }
        if (budget >= priceShip){
            System.out.printf("Yes! You have %.2f leva left.",budget-priceShip);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.",priceShip-budget);
        }


    }
}
