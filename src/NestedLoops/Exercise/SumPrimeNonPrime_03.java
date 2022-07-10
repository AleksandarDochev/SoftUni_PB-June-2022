package NestedLoops.Exercise;

import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);


        int currentNum =0;
        int prime = 0;
        int nonPrime = 0;
        String input = scanner.nextLine();
        //purviq while e proverka na wseki edin red
        while (!input.equals("stop")){
            int number = Integer.parseInt(input);
            if (number < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            boolean flag = true;
            for (int i = 2 ; i <=number -1; i++){

                 if (number % i ==0) {
                    nonPrime +=number;
                    flag = false;
                    break;
                }
            }
            if (flag){
                prime+=number;
            }
            input =scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: "+prime);
        System.out.println("Sum of all non prime numbers is: "+nonPrime);
    }
}
