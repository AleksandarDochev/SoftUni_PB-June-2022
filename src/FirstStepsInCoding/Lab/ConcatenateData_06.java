package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class ConcatenateData_06 {
    public static void main(String[] args) {
        //You are <firstName> <lastName>, a <age>-years old person from <town>.
        Scanner scanner = new Scanner(System.in);
        String FirstName = scanner.nextLine();
        String LastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();
        System.out.println("You are "+FirstName+" "+LastName+", a "+age+"-years old person from "+town+".");

    }
}
