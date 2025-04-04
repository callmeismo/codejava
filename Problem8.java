import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long number1 = input.nextInt();
        long number2 = input.nextInt();

        long number3 = (number1 > number2) ? number2 : number1;
        long commomDivisor = 1;
        for(int i = 1; i <= number3; i++)
            if(number1 % i == 0 && number2 % i == 0)
                commomDivisor = i;
        System.out.println(commomDivisor);
        input.close();
    }
}
