package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int FoodPacketsDog = Integer.parseInt(scanner.nextLine());
        int FoodPacketsCat = Integer.parseInt(scanner.nextLine());
        double CatFoodPrice = 4;
        double DogFoodPrice = 2.50;
        System.out.println((FoodPacketsDog*DogFoodPrice)+(FoodPacketsCat*CatFoodPrice));
    }
}
