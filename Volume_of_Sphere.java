import java.util.*;
public class Volume{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        float pi = 3.14f;
        float volume = (4.0f/3.0f)*pi*r*r*r;
        System.out.printf("%.2f
",volume);
    }
}