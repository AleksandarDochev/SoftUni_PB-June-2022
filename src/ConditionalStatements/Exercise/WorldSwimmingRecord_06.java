package ConditionalStatements.Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double secRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secPerMeterRecord = Double.parseDouble(scanner.nextLine());

        double ivanTime = distance * secPerMeterRecord;
        // Math.floor() zakruglq do nai malkoto cqlo 4islo nadolu example 5.6= 5
        double restiance = Math.floor(distance / 15) * 12.50;
        //double restiance2 = (distance / 15) * 12.50;
        ivanTime = ivanTime + restiance;
        if (ivanTime < secRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",ivanTime);
        }
        else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",ivanTime-secRecord);
        }

    }
}
