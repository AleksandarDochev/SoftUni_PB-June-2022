package ExamPreparation.PreExam;

import java.util.Scanner;

public class Balls_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int N = Integer.parseInt(scanner.nextLine());


        int points = 0;
        int redBalls =0;
        int orangeBalls =0;
        int yellowBalls=0;
        int whiteBalls= 0;
        int otherBalls=0;
        int blackBallsDivisions=0;

        for (int i = 1;i <= N;i++ ){
            String colour = scanner.nextLine();
            switch (colour){
                case "red":
                    points +=5;
                    redBalls ++;
                    break;
                case "orange":
                    points +=10;
                    orangeBalls++;
                    break;
                case "yellow":
                    points +=15;
                    yellowBalls++;
                    break;
                case "white":
                    points +=20;
                    whiteBalls++;
                    break;
                case "black":
                    points = points/2;
                    blackBallsDivisions++;
                    break;
                default:
                    otherBalls++;
                    break;
            }
        }
        System.out.printf("Total points: %d",points);
        System.out.printf("\nRed balls: %d",redBalls);
        System.out.printf("\nOrange balls: %d",orangeBalls);
        System.out.printf("\nYellow balls: %d",yellowBalls);
        System.out.printf("\nWhite balls: %d",whiteBalls);
        System.out.printf("\nOther colors picked: %d",otherBalls);
        System.out.printf("\nDivides from black balls: %d",blackBallsDivisions);



    }
}
