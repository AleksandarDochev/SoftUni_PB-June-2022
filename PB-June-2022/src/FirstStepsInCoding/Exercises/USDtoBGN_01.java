package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class USDtoBGN_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usdInputScanner = Double.parseDouble(scanner.nextLine());
        double USDtoBGN = usdInputScanner * 1.79549 ;
        System.out.println(USDtoBGN);
    }
}
