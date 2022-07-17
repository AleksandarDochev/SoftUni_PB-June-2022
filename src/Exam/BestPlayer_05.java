package Exam;

import java.util.Scanner;

public class BestPlayer_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int mostGoals = Integer.MIN_VALUE;
        String winner = "";

        while (true){
            String playerName = scanner.nextLine();
            if (playerName.equals("END")){

                System.out.printf("%s is the best player!",winner);
                if(mostGoals >= 3){
                    System.out.printf("\nHe has scored %d goals and made a hat-trick !!!",mostGoals);
                } else if (mostGoals < 3) {
                    System.out.printf("\nHe has scored %d goals.",mostGoals);
                }
                break;
            }
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > mostGoals){
                mostGoals = goals;
                winner = playerName;
            }
            if (goals >= 10) {
                mostGoals = goals;
                winner = playerName;
                System.out.printf("%s is the best player!",winner);
                System.out.printf("\nHe has scored %d goals and made a hat-trick !!!",mostGoals);
                break;
            }
        }
    }
}
