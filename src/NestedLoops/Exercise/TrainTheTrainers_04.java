package NestedLoops.Exercise;

import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int countGrades =0;
        double totalGrades =0;

        while (!input.equals("Finish")){
            String presentationName = input;
            double sumCurrentPresentationGrades =0;
            for (int i =1; i <= jury ; i++){
                double grade = Double.parseDouble(scanner.nextLine());
                countGrades++;
                sumCurrentPresentationGrades += grade;
            }
            totalGrades += sumCurrentPresentationGrades;
            System.out.printf("%s - %.2f.%n",presentationName,sumCurrentPresentationGrades/jury);
            input= scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.%n",totalGrades/countGrades);
    }
}
