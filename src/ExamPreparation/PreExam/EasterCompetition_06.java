package ExamPreparation.PreExam;

import java.util.Scanner;

public class EasterCompetition_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int constestantsCount = Integer.parseInt(scanner.nextLine());
        int totalPointsChef = 0;


        int maxPoints = Integer.MIN_VALUE;
        String winner = "";

        for (int i = 1;i <=constestantsCount;i++){

            totalPointsChef =0;
            String nameChef = scanner.nextLine();
            while (true){
                String input = scanner.nextLine();
                if (input.equals("Stop")){
                    System.out.printf("\n%s has %d points.",nameChef,totalPointsChef);
                    break;
                }
                int currentPoints =Integer.parseInt(input);
                totalPointsChef +=currentPoints;

            }
            if (totalPointsChef > maxPoints){
                maxPoints = totalPointsChef;
                System.out.printf("\n%s is the new number 1!",nameChef);
                winner = nameChef;
            }
        }
        System.out.printf("\n%s won competition with %d points!",winner,maxPoints);
    }
}
