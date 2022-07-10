package ConditionalStatements.Exercise;

import java.util.Scanner;

public class BonusScore_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int baseNum = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (baseNum <= 100){
            bonus = bonus +5;

        } else if (baseNum < 1000) {
            bonus = baseNum * 0.20;
            
        } else if (baseNum > 1000) {
            bonus = baseNum * 0.10;
        }

        //celo4isleno delenie e towa i proizwejda ostatuk 1 ili 0 ake ne4etno ili 4etno
        if (baseNum % 2 == 0){
            bonus = bonus + 1;
            //xelo4isleno delkenie na 10 za da raberem dali 4isloto zwu6wa na 5 kato imame ostuk 5
        }else if(baseNum % 10 == 5) {
            bonus = bonus + 2;
        }
        System.out.println(bonus);
        System.out.println(baseNum+bonus);
    }
}
