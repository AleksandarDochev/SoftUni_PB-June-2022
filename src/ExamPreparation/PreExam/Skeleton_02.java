package ExamPreparation.PreExam;

import java.util.Scanner;

public class Skeleton_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int min = Integer.parseInt(scanner.nextLine());
        int sec = Integer.parseInt(scanner.nextLine());
        double distanceMeters  = Double.parseDouble(scanner.nextLine());
        int secFor100_Meters = Integer.parseInt(scanner.nextLine());

        double controlTimeSec = 60*min+sec;
        double multipleTimesSaved = distanceMeters/120;
        double totalTimeSaved = multipleTimesSaved*2.5;
        double timeMarin = (distanceMeters/100)*secFor100_Meters-totalTimeSaved;
        double timeNeeded= (timeMarin-controlTimeSec);

        if (timeMarin <= controlTimeSec){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.",timeMarin);
        }else {

            System.out.printf("No, Marin failed! He was %.3f second slower.",timeNeeded);
        }

    }
}
