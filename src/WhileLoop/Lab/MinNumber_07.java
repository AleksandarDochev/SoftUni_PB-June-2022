package WhileLoop.Lab;

import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        String input = scanner.nextLine();
        int minNumber = Integer.MAX_VALUE;

        while (!input.equals("Stop")){
            int parsedIntNumber = Integer.parseInt(input);
            if (minNumber > parsedIntNumber){
                minNumber = parsedIntNumber;
            }
            input = scanner.nextLine();
        }
        System.out.println(minNumber);
    }
}
