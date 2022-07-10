package ConditionalStatementsAdvanced.Exercise;

import java.util.Scanner;

public class OnTimeForTheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int hourExam = Integer.parseInt(scanner.nextLine());
        int minExam = Integer.parseInt(scanner.nextLine());
        int hourArrival = Integer.parseInt(scanner.nextLine());
        int minArrival = Integer.parseInt(scanner.nextLine());

        int examAllMin = hourExam * 60 + minExam;
        int arriveAllMin = hourArrival* 60 +minArrival;
        int diffExamMinusArrive = Math.abs(examAllMin-arriveAllMin);
        int diffHour = diffExamMinusArrive /60;
        int diffMin = diffExamMinusArrive % 60;

        if (examAllMin < arriveAllMin){
            System.out.println("Late");
            if (diffHour==0){
                System.out.printf("%d minutes after the start", diffMin);
            }else {
                //We put 02 between % and d to force it to make double digits if 0 = 00
                //if 5 = 05
                System.out.printf("%d:%02d hours after the start",diffHour,diffMin );
            }

        }else if (examAllMin == arriveAllMin  || examAllMin - arriveAllMin <=30){
            System.out.println("On time");
            if (diffHour==0){
                System.out.printf("%d minutes before the start",diffMin);
            }else {
                //We put 02 between % and d to force it to make double digits if 0 = 00
                //if 5 = 05
                System.out.printf("%d:%02d hours before the start",diffHour,diffMin );
            }
        }else if(examAllMin > arriveAllMin || examAllMin - arriveAllMin > 30){
            System.out.println("Early");
            if (diffHour==0 ){
                System.out.printf("%d minutes before the start",diffMin);
            }else {
                //We put 02 between % and d to force it to make double digits if 0 = 00
                //if 5 = 05
                System.out.printf("%d:%02d hours before the start",diffHour,diffMin );
            }
        }

    }
}
