import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem8 {
    public static void main(String[] args) {
        String ipv4 = "172.16.254.01";
        String ipv4Regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." + 
        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." + 
        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." + 
        "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";  
        Pattern pattern = Pattern.compile(ipv4Regex);
        Matcher matcher = pattern.matcher(ipv4);

        if (matcher.matches()) {
            System.out.println("Ipv4 address is validate.");
        } else {
            System.out.println("Ipv4 address is not validate.");
        }
    }
}
