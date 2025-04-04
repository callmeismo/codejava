import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        switch (month) {
            case 1:
            case 2:
            case 3:
                System.out.println("Month in the first quarter");
                break;
            
            case 4:
            case 5:
            case 6:
                System.out.println("Month in the second quarter");
                break;
            
            case 7:
            case 8:
            case 9:
                System.out.println("Month in the third quarter");
                break;
            
            case 10:
            case 11:
            case 12:
                System.out.println("Month in the fourth quarter");
                break;
            
            default:
                System.out.println("Input month is not correct");
                break;
        }
        input.close();
    }
}
