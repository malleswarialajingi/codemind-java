import java.util.*;
public class Cost{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int x = scan.nextInt();
        int perimeter = 2*(n+m);
        int cost = perimeter*x;
        System.out.println(cost);
    }
}