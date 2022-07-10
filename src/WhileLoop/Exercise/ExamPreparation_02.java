package WhileLoop.Exercise;

import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //broi nezadovolitelni ocenli
        int badGradeLimit = Integer.parseInt(scanner.nextLine());
        int badCurrentGrades = 0;
        //ime zada4a
        int numberTasks = 0;
        double averageScore = 0;
        String lastProblem = "";

        while (true){
            //imeto pak se4ete
            String taskName = scanner.nextLine();
            if (taskName.equals("Enough")){
                System.out.printf("Average score: %.2f\n",averageScore/numberTasks);
                System.out.printf("Number of problems: %d\n",numberTasks);
                System.out.printf("Last problem: %s\n",lastProblem);
                break;

            } else {
                numberTasks = numberTasks +1;
                lastProblem = taskName;
            }

            //ocekata kum satvetna zada4a
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <= 4){
                badCurrentGrades =badCurrentGrades + 1;
            }
            if (badCurrentGrades >= badGradeLimit ) {
                System.out.printf("You need a break, %d poor grades.", badCurrentGrades);
                break;
            }else {
                averageScore =averageScore +grade;
            }

        }



    }
}
