import java.util.*;
public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sb = input.nextLine();
        String result = "";
        // StringBuilder sb1 = new StringBuilder(result);
        // sb1.append(sb.charAt(0)).append(sb.charAt(1));
        // System.out.println(sb1.toString());
        int count = 0;
        while(count < sb.length() - 1){
            String swap = "";
            swap = swap + sb.charAt(count) + sb.charAt(count + 1);
            result = result + reversed(swap);
            count = count + 2;
        }
        if(count < sb.length())
            result = result + sb.charAt(sb.length()-1);
        System.out.println(result);
        input.close();
    }
    public static String reversed(String sb){
        StringBuilder newString = new StringBuilder(sb);
        newString.reverse();
        return newString.toString();
    }
}
