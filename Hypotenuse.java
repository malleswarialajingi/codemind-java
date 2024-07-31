import java.util.*;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        float b = scan.nextFloat();
        float c = (float) Math.sqrt(a * a + b * b);
        System.out.printf("%.2f%n", c);
    }
}