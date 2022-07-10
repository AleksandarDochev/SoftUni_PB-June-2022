package ForLoop.Exercise;

public class DEMO {
    public static void main(String[] args) {
        int a = 7;
        int sum1 = a++;
        int sum2 = ++a;
        int sum3 = a--;
        int sum4 = --a;
        System.out.println(sum1 + sum2 + sum3 - sum4);
    }
}
