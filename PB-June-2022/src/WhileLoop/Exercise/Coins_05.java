package WhileLoop.Exercise;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        DecimalFormat dF = new DecimalFormat("0.00");
        double input = Double.parseDouble(scanner.nextLine());
        int pennyCounter = 0;

        while (true){
            input = Math.round(input * 100.0)/100.0;
            if (input >=2){
                input -=2;
                pennyCounter ++;
            } else if (input >= 1 &&input < 2) {
                input --;
                pennyCounter ++;
            } else if (input >= 0.50) {
                input -= 0.50;
                pennyCounter ++;
            } else if (input >= 0.20) {
                input -= 0.20;
                pennyCounter ++;
            } else if (input >= 0.10) {
                input -= 0.10;
                pennyCounter ++;
            } else if (input >= 0.05) {
                input -= 0.05;
                pennyCounter ++;
            } else if (input >= 0.02) {
                input -= 0.02;
                pennyCounter ++;
            } else if (input >= 0.01) {
                input -= 0.01;
                pennyCounter ++;
            } else if (input == 0) {
                break;
            }
        }
        System.out.println(pennyCounter);


    }
}
