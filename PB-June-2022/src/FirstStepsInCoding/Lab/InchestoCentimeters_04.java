package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class InchestoCentimeters_04 {
    public static void main(String[] args) {
        //(1 инч = 2.54 сантиметр
        Scanner scanner = new Scanner(System.in);
        double inch = Double.parseDouble(scanner.nextLine());
        double cm = 2.54;
        System.out.println(inch * cm);
    }
}
