package ConditionalStatements.Exercise;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int f = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());
        int t = Integer.parseInt(scanner.nextLine());

        int sumSec = f+s+t;
        int min = sumSec / 60;
        int sec = sumSec % 60;

        if (sec<10) {
            System.out.printf("%d:0%d",min,sec);
        }else{
            System.out.printf("%d:%d",min,sec);
        }

        //System.out.printf("%d:%02d",min,sec);

    }
}
