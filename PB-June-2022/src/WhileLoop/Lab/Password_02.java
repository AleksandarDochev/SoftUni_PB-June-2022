package WhileLoop.Lab;

import java.util.Scanner;

public class Password_02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String username = scanner.nextLine();//4ete red 1
        String password = scanner.nextLine();//4ete red 2
        String input =scanner.nextLine();    //4ete red 3

        while (!input.equals(password)){     //are input 3 ne e rawen na parolata proverqwame pak ipak ipak
            input =scanner.nextLine();
        }
        System.out.printf("Welcome %s!",username);

    }
}
