import java.util.Scanner;

public class Fill{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = (a*b)/(a+b);
        System.out.println(c);
    }
}