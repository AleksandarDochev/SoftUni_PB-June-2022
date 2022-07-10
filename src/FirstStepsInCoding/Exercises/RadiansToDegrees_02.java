package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class RadiansToDegrees_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radiants = Double.parseDouble(scanner.nextLine());
        double degrees = radiants * 180 / Math.PI;
        System.out.println(degrees);
    }
}
