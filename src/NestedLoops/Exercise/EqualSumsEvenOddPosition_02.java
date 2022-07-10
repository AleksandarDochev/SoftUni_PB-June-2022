package NestedLoops.Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        int fistNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        for (int i = fistNumber; i <= secondNumber; i++){
            int currentNum = i;
            int oddSum=0;
            int evenSum=0;
            //a for cycle so we can check each number position of the number i
            //we have 6 digit numbers so j=6 and we walk from to the start backwards
            //za towa imame moduulno delenie na 10 da wzemem ostatuka
            for (int j = 6  ;j >=1 ;j--){
                int digit = currentNum % 10;
                //if the position of the digit is even we add
                if (j % 2 ==0){
                    evenSum += digit;
                } else if (j % 2 ==1) {
                    oddSum += digit;
                }

                //we do this so we cut the number by 1 digit and we do it by / by 10
                //whenb we 123456 /10 we get 12345,6 BUT integer java deletes the 0,6 so
                // number becomes from 123456 to 12345
                currentNum =currentNum / 10;
            }
            if (evenSum == oddSum){
                System.out.print(i+" ");
            }
        }

    }
}
