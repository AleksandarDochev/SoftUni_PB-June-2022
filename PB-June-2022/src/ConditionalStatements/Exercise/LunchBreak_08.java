package ConditionalStatements.Exercise;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String seriesName = scanner.nextLine();
        int seriesTime = Integer.parseInt(scanner.nextLine());
        int breakTime= Integer.parseInt(scanner.nextLine());

        double lunchTime = breakTime * 0.125;
        double sleepTime = breakTime * 0.25;

        double totalTime = seriesTime+lunchTime+sleepTime;
        double timeLeft = Math.abs(breakTime -totalTime);

        if (breakTime >= totalTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time."
                    ,seriesName,Math.ceil(timeLeft));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes."
                    ,seriesName,Math.ceil(timeLeft));
        }
    }
}
