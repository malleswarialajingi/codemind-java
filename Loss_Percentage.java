import java.util.*;
public class Percent{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int CP = scan.nextInt();
        int SP = scan.nextInt();
        float percent = (float) (CP - SP)*100/CP;
        System.out.printf("%.2f
",percent);
    }
}