package WhileLoop.Exercise;

import java.util.Scanner;

public class Moving_07 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int roomVolume = width * length * height;

        String input = scanner.nextLine();

        while (!input.equals("Done")){
            //brio ka6oni
            int cartons = Integer.parseInt(input);
            roomVolume = roomVolume-cartons;
            //Ako free space no more
            if (roomVolume <= 0){
                break;
            }
            input = scanner.nextLine();
        }
        if (roomVolume <= 0){
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(roomVolume));
        }else {
            System.out.printf("%d Cubic meters left.",roomVolume);
        }


    }
}
