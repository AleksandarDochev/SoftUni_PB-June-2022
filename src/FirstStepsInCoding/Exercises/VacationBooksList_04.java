package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class VacationBooksList_04 {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int NumPages = Integer.parseInt(scanner.nextLine());
        int PagesPerHour = Integer.parseInt(scanner.nextLine());
        int NumDays = Integer.parseInt(scanner.nextLine());
        int HoursPerDay = (NumPages / PagesPerHour) / NumDays;
        System.out.println(HoursPerDay);
    }
}
