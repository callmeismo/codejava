import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextInt();
        long sumOfEven = sumOfEven(number);
        System.out.println(sumOfEven);
        input.close();
    }
    public static long sumOfEven(long a){
        long result = 0;
        for(int i = 2 ; i <= a ; i = i + 2)
        result = result + i;
        return result;
    }
}
