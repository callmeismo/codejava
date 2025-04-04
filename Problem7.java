
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Problem7 {
    public static void main(String[] args) {
        String number = "098763567810";
        String numberRegex = "\\b0[0-9]{9}\\b";

        Pattern pattern = Pattern.compile(numberRegex);
        Matcher matcher = pattern.matcher(number);

        if (matcher.matches()) {
            System.out.println("Number is validate.");
        } else {
            System.out.println("Number is not validate.");
        }
    }
}
