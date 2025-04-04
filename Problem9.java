import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number = input.nextInt();
        int count = 0;

        for(int i = 1; i <= number; i++)
            if (number % i == 0)
                count++;
        String result = (count == 2) ? "Number is prime" : "Number is not prime";
        System.out.println(result);
        input.close();
    }
}
