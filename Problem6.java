import java.util.Arrays;
import java.util.Scanner;

public class Problem6 {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a string 1: ");
        // String str1 = scanner.nextLine();
        // System.out.print("Enter a string 2: ");
        // String str2 = scanner.nextLine();
        // str1 = str1.toLowerCase();
        // str2 = str2.toLowerCase();
        // int count = 0;
        // for(int i = 0 ; i < str1.length() ; i++){
        //     for (int j = 0; j < str2.length(); j++){
        //         if(str1.charAt(i) == str2.charAt(j))
        //             count ++;
        //     }
        // }
        // if(count == str1.length() && str1.length() == str2.length())
        //     System.out.println("True");
        // else
        //     System.out.println("False");
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi đầu vào
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().toLowerCase(); // Chuyển về chữ thường
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().toLowerCase(); // Chuyển về chữ thường

        // Kiểm tra xem hai chuỗi có phải là từ đảo chữ của nhau không
        boolean result = areAnagrams(str1, str2);
        System.out.println(result);
        
        scanner.close();
    }

    private static boolean areAnagrams(String str1, String str2) {
        // Nếu độ dài không bằng nhau, không thể là từ đảo chữ
        if (str1.length() != str2.length()) {
            return false;
        }

        // Chuyển chuỗi thành mảng ký tự
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sắp xếp mảng ký tự
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // So sánh hai mảng đã sắp xếp
        return Arrays.equals(charArray1, charArray2);
    }
}