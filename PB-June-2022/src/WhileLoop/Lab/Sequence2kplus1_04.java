package WhileLoop.Lab;

import java.util.Scanner;

public class Sequence2kplus1_04 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 1;
        System.out.println(sum);

       while (true){
           sum = sum * 2 + 1;
           if (n < sum){
               break;
           }
           System.out.println(sum);
       }



    }
}
