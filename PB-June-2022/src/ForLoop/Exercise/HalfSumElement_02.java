package ForLoop.Exercise;

import java.util.Scanner;

public class HalfSumElement_02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //reads how many number are given to the console
        int n = Integer.parseInt(scanner.nextLine());
        ///idk
        int max =Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
      //  System.out.println(max);
       // System.out.println(min);
        int sum = 0;
        System.out.println("Number or numbers-1 cuz 1 is 0 :  " +n);
        for (int i = 1;i <= n; i++ ){
            int number = Integer.parseInt(scanner.nextLine());
            sum += number;
            if (number > max){
                max = number;
            }
            int sumWithoutMaxNumber = sum - max;
            if (max == sumWithoutMaxNumber) {
                System.out.println("Yes");
                System.out.println("Sum = " + max);
            }else {
                int diff = Math.abs(max - sumWithoutMaxNumber);
                System.out.println("No");
                System.out.println("Diff = " + diff);
            }


        }

    }
}
