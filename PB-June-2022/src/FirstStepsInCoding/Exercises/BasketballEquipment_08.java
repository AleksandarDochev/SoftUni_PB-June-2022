package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double TaxForYear = Double.parseDouble(scanner.nextLine());

        double BasketballShoesPrice = TaxForYear-(TaxForYear * 40/ 100.00);
        double BasketballEqupmentPrice = BasketballShoesPrice - (BasketballShoesPrice*20/100.00);
        double BasketballBallPrice = BasketballEqupmentPrice * 25/100.00;
        double BasketballAccessories = BasketballBallPrice * 20/100.00;
        double BasketballAllExpences = TaxForYear+BasketballShoesPrice+
                                       BasketballEqupmentPrice+
                                       BasketballBallPrice+
                                       BasketballAccessories;
        System.out.println(BasketballAllExpences);
    }
}