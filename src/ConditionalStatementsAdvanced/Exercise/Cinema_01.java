package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String projectType = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        double income = 0.0;

        if (projectType.equals("Premiere")){
            income = row*columns*12;
        } else if (projectType.equals("Normal")) {
            income = row*columns*7.50;

        } else if (projectType.equals("Discount")) {
            income = row*columns*5;
        }
        System.out.printf("%.2f leva",income);
    }
}
