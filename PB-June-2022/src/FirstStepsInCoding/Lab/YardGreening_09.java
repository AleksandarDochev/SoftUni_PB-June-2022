package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        //Цената на един кв. м. е 7.61 лв със ДДС. Понеже нейният двор е доста голям,
        // фирмата изпълнител предлага 18% отстъпка от крайната цена.
        //"The final price is: {крайна цена на услугата} lv."
        //
        //"The discount is: {отстъпка} lv."
        Scanner scanner = new Scanner(System.in);
        double SquareMetersToGreen = Double.parseDouble(scanner.nextLine());
        double PricePerSquareMeter = 7.61;
        double DiscountPercent = 18/100.00;
        double OriginalPrice = SquareMetersToGreen*PricePerSquareMeter;
        double TheAmoutOFDiscountedPrice = OriginalPrice*DiscountPercent;
        double OnlyDiscount = OriginalPrice-TheAmoutOFDiscountedPrice;
        System.out.println("The final price is: "+OnlyDiscount+" lv."+"\n" +"The discount is: "+TheAmoutOFDiscountedPrice+" lv.");
    }
}
