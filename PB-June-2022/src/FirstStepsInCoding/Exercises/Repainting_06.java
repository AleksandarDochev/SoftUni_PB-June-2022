package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int NealonPerSquareMeter = Integer.parseInt(scanner.nextLine());
        int PaintLiters = Integer.parseInt(scanner.nextLine());
        int ThinnerLiters = Integer.parseInt(scanner.nextLine());
        int HoursWorked = Integer.parseInt(scanner.nextLine());


        double NaelonPrice = (NealonPerSquareMeter + 2)* 1.50;
        double PaintPrice = (PaintLiters+ PaintLiters * 10/100.00)*14.50;
        double ThinnerPrice = ThinnerLiters *5.00;
        double BagsPrice = 0.40;

        double SumMatirails = NaelonPrice+PaintPrice+ThinnerPrice+BagsPrice;
        double WorkingPrice = (SumMatirails * 30/100)*HoursWorked;
        double EndSumForAllWork = SumMatirails+WorkingPrice;
//        System.out.println("Сума за найлон:" + NaelonPrice);
//        System.out.println("Сума за боя: " + PaintPrice);
//        System.out.println("Сума за разредител: " + ThinnerPrice + "\n"+
//                           "Сума за торбички: "  + BagsPrice);
//        System.out.println("Обща сума за материали:"+SumMatirails);
//        System.out.println("Сума за майстори: " + WorkingPrice);
//        System.out.println("Крайна сума:" + EndSumForAllWork);
        System.out.println(EndSumForAllWork);

    }
}
