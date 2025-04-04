import java.util.*;
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number1 = sc.nextLong();
        long number2 = sc.nextLong();
        char operator = sc.next().charAt(0);
        long result;
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;

            case '-':
                result = number1 - number2;
                break;
            
            case '*':
                result = number1 * number2;
                break;

            default:
                result = number1 / number2;
                break;
        }
        sc.close();
        System.out.println(result);
    }
}
