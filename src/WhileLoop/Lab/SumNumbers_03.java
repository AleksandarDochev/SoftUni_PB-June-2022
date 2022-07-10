package WhileLoop.Lab;

import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        while (true){
            int input = Integer.parseInt(scanner.nextLine());
            sum += input;
            if (sum>=n){
                System.out.println(sum);
                break;
            }
        }
    }
}
