import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long year;
        do{
        year = input.nextInt();
        if (year < 0)
            System.out.println("Nam khong hop le. Vui long nhap lai");
        }
        while (year < 0);   
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 )
            System.out.print("Nam " + year + " la nam nhuan");
        else
        System.out.print("Nam" + year + " khong phai la nam nhuan");
        input.close();
    }
}
