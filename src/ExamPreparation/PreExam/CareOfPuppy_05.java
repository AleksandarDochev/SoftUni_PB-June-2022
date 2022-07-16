package ExamPreparation.PreExam;

import java.util.Scanner;

public class CareOfPuppy_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);


        int kgBoughtFood = Integer.parseInt(scanner.nextLine());
        int gramsBoughFood = kgBoughtFood*1000;
        int doggyFoodConsumption=0;

        while (true){
            String input = scanner.nextLine();
            if (input.equals("Adopted")){
                break;
            }
            int gramsFood =Integer.parseInt(input);
            doggyFoodConsumption= doggyFoodConsumption+gramsFood;
        }
        if (gramsBoughFood >= doggyFoodConsumption ){
            System.out.printf("Food is enough! Leftovers: %d grams.",gramsBoughFood-doggyFoodConsumption);
        } else {
            System.out.printf("Food is not enough. You need %d grams more.",doggyFoodConsumption-gramsBoughFood);

        }

    }
}
