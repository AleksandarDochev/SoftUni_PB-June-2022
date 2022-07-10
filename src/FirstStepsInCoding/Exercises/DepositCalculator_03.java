package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble( scanner.nextLine());
        int depositMonths = Integer.parseInt(scanner.nextLine());
        double depositYearlyInterestRate = Double.parseDouble(scanner.nextLine());
        double SUM = deposit + depositMonths * ((deposit * depositYearlyInterestRate/100)/12);
        System.out.println(SUM);
    }
}
