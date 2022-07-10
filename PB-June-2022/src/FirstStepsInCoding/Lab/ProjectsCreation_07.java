package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ProjectsCreation_07 {
    public static void main(String[] args) {

        //George
        //4
        //The architect George will need 12 hours to complete 4 project/s.
        Scanner scanner = new Scanner(System.in);
        String Achitect = scanner.nextLine();
        int NumProjects = Integer.parseInt(scanner.nextLine());
        System.out.println("The architect "+Achitect+" will need "+3*NumProjects+" hours to complete "+NumProjects+" project/s.");

    }
}
