package WhileLoop.Lab;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String name =scanner.nextLine();
        int goodGrades = 0;
        int badGrades =0;
        double finalGrade = 0;


        while (true){
            double grade = Double.parseDouble(scanner.nextLine());

            if (grade >= 4){
                goodGrades =goodGrades + 1;
            } else if (grade < 4) {
                badGrades = badGrades +1;
            }
            finalGrade = finalGrade + grade;
            if (goodGrades >=12){
                System.out.printf("%s graduated. Average grade: %.2f",name,finalGrade/12);
                break;
            } else if (badGrades >=2) {
                System.out.printf("%s has been excluded at %d grade",name,goodGrades+1);
                break;

            }

        }

    }
}
