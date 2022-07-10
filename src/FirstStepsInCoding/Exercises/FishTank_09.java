package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int LengthCM = Integer.parseInt(scanner.nextLine());
        int WidthCM = Integer.parseInt(scanner.nextLine());
        int HeightCM = Integer.parseInt(scanner.nextLine());
        double ProcentageWater = (Double.parseDouble(scanner.nextLine())) / 100.00;
        double Volume = LengthCM*WidthCM*HeightCM;
        double VolumeLiters = Volume * 0.001;
        double SpaceTakenNumericalCovert = ProcentageWater;
        double NeededLiters = VolumeLiters*(1-SpaceTakenNumericalCovert);
        System.out.println(NeededLiters);
    }
}
