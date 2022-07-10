package WhileLoop.Lab;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        String input = scanner.nextLine();
        double amount = 0;

        while (!input.equals("NoMoreMoney")){
            double currentSum = Double.parseDouble(input);
            if (currentSum < 0){
                System.out.println("Invalid operation!");
                break;
            }
            amount = amount + currentSum;

            System.out.printf("Increase: %.2f\n", currentSum);
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f",amount);

        }
    }
