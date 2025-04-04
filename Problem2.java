import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int a = input.nextInt();
       int b = input.nextInt();
       int max = (a > b) ? a : b ;
       System.out.println(max);  
       input.close();
    }
}
