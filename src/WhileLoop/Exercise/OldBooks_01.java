package WhileLoop.Exercise;

import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String bookSearched = scanner.nextLine();
        String input = scanner.nextLine();
        int bookCount = 1;


        while (!input.equals("No More Books")){
            input = scanner.nextLine();
            if (input.equals("No More Books")){
                break;
            }
            if (!bookSearched.equals(input)){
                bookCount = bookCount +1;
            }else if (bookSearched.equals(input)){
                System.out.printf("You checked %d books and found it.",bookCount);
                break;
            }
        }
        if (input.equals("No More Books")){
            System.out.printf("\nThe book you search is not here!\nYou checked %d books.",bookCount);
        }

    }
}
