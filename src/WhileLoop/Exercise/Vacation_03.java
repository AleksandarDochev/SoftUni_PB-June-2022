package WhileLoop.Exercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        double moneyVacation = Double.parseDouble(scanner.nextLine());
        double moneyNow = Double.parseDouble(scanner.nextLine());
        int daysSpendSave = 0 ;
        int daysConsecutiveSpending = 0;



        while (true){
            String spend_save = scanner.nextLine();
            double moneySaveSpend = Double.parseDouble(scanner.nextLine());
            switch (spend_save){
                case "spend":
                    daysConsecutiveSpending = daysConsecutiveSpending +1;
                    if (daysConsecutiveSpending ==5){
                        break;
                    }
                    moneyNow = (moneyNow-moneySaveSpend);
                    if (moneyNow<0){
                        moneyNow = 0;
                    }
                    break;
                case "save":
                    daysConsecutiveSpending = 0;
                    moneyNow = moneyNow+moneySaveSpend;
                    break;
            }
            if (daysConsecutiveSpending ==5){
                System.out.printf("You can't save the money.\n%d",daysConsecutiveSpending);
                break;
            }
            if (moneyNow < moneyVacation){
               daysSpendSave = daysSpendSave + 1;
            }else if (moneyNow == moneyVacation){
                daysSpendSave = daysSpendSave + 1;
                System.out.printf("You saved the money for %d days.",daysSpendSave);
                break;
            }
        }
    }
}
