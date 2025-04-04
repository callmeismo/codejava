import java.util.Scanner;
public class Problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextInt();
        long sum = sum(number);
        System.out.println(sum);
        input.close(); 
    }
    public static long sum(long a){
        long result = (a == 1 || a == 0) ? 1 : (a + sum(a - 1));
        return result;
    }
    
}
