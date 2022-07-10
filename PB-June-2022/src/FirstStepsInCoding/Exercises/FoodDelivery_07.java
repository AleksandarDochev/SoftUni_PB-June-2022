package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ChickenMenus = Integer.parseInt(scanner.nextLine());
        int FishMenus = Integer.parseInt(scanner.nextLine());
        int VegetarianMenus = Integer.parseInt(scanner.nextLine());

        double ChickenMenusPrice = ChickenMenus * 10.35;
        double FishMenusPrice = FishMenus * 12.40;
        double VegetarianMenusPrice = VegetarianMenus * 8.15;
        double SumAllMenusPrice = ChickenMenusPrice+FishMenusPrice+VegetarianMenusPrice;
        double DesertPrice = SumAllMenusPrice * 20/100.00;
        double DeliveryPrice = 2.50;
        double FullPrice = SumAllMenusPrice + DesertPrice +DeliveryPrice;
        System.out.println(FullPrice);
    }
}
