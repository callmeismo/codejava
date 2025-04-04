import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        int [] iArray = {1,2,4,5,2,4,4,5,2,1};
        Arrays.sort(iArray);
        System.out.println("Tan so cua cac phan tu:");
        int count = 1; // Khởi tạo tần số

        for (int i = 1; i < iArray.length; i++) {
            if (iArray[i] == iArray[i - 1]) {
                count++; // Tăng tần số nếu phần tử trùng (1,1,2,2,2,4,4,4,5,5)
            } else {
                // Hiển thị tần số của phần tử trước đó
                System.out.println("Phan tu: " + iArray[i - 1] + ", Tan so: " + count);
                count = 1; // Đặt lại tần số cho phần tử mới
            }
        }

        // Hiển thị tần số của phần tử cuối cùng
        System.out.println("Phan tử: " + iArray[iArray.length - 1] + ", Tan so: " + count);
    }
}
