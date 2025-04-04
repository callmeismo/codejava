public class Problem3 {
    public static void main(String[] args) {
        String stringOriginal = "AbA";
        String reversed = new StringBuilder(stringOriginal).reverse().toString();
        String result = (stringOriginal.equals(reversed)) ? "Palindrome" : "No Panlidrome";
        System.out.println(result);
    }
}
