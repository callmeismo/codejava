import java.util.*;
public class Problem1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int average = sc.nextInt();
        while (average < 0 || average > 10) {
           average = sc.nextInt(); 
        }   
        String result = (average >= 5) ? "pass" : "fail";
        System.out.println(result);
        sc.close();
    }
}
