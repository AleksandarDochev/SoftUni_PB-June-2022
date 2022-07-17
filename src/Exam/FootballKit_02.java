package Exam;

import java.util.Scanner;

public class FootballKit_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        double tshirtPrice= Double.parseDouble(scanner.nextLine());
        double winningSum = Double.parseDouble(scanner.nextLine());

        double shortsPrice= tshirtPrice*0.75;
        double socksPrice = shortsPrice*0.20;
        double shoesPrice = (tshirtPrice+shortsPrice)*2;

        double spent= tshirtPrice+shortsPrice+socksPrice+shoesPrice;
        double finalSpent= spent-(spent*0.15);

        if (finalSpent >= winningSum){
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.",finalSpent);
        }else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.",winningSum-finalSpent);

        }

    }
}
