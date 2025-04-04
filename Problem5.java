import java.util.*;
public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextInt();
        long factorial = factorial(number);
        System.out.println(factorial);
        input.close();

    }
    public static long factorial(long a){
        long result = (a == 1 || a == 0) ? 1 : (a * factorial(a - 1));
        return result;
    }
}
