import java.util.Scanner;

public class Problem5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.println("Permutations:");
        permute(input.toCharArray(), 0);
        
        scanner.close();
    }

    private static void permute(char[] arr, int index) {
        if (index == arr.length - 1) {
            System.out.println(new String(arr));
        } else {
            for (int i = index; i < arr.length; i++) {
                swap(arr, index, i);
                permute(arr, index + 1);
                swap(arr, index, i); // Hoán đổi lại để phục hồi trạng thái ban đầu
            }
        }
    }

    private static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}