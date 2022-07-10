package ConditionalStatements.Exercise;

import java.util.Scanner;

public class Shoping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double buget = Double.parseDouble(scanner.nextLine());
        int videoNum= Integer.parseInt(scanner.nextLine());
        int cpuNum = Integer.parseInt(scanner.nextLine());
        int ramNum = Integer.parseInt(scanner.nextLine());

        double videoPrice = videoNum * 250.00;
        double cpuPrice = cpuNum * (videoPrice * 0.35);
        double ramPrice = ramNum * (videoPrice * 0.10);
        double totalsum = videoPrice + cpuPrice +ramPrice;

        if (videoNum>cpuNum){
            totalsum = totalsum - (totalsum * 0.15);
        }
        if (buget > totalsum){
            System.out.printf("You have %.2f leva left!",buget-totalsum);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",totalsum-buget);
        }

    }
}
