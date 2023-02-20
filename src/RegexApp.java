import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cek String apakah email, tanggal atau IPV4");
        System.out.print("masukkan string : ");
        String inputUser = input.nextLine();
        regex(inputUser);
    }

    public static  void regex(String string){
        // pattern Email
        String emailPattern = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

        // pattern IPV4
        String ipPattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." + "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

        // pattern date
        String datePattern1 = "^\\d{2}-\\d{2}-\\d{4}$";
        String str = string;
        Pattern pattern = Pattern.compile("^[a-zA-Z]+,\\s[a-zA-Z]+\\s\\d{2}$");
        Matcher matcher = pattern.matcher(string);

        if (string.matches(emailPattern)){
            System.out.println("This String Is Email");
        } else if (string.matches(ipPattern)) {
            System.out.println("This String Is IPV4");
        } else if (string.matches(datePattern1) || matcher.matches()) {
            System.out.println("This String Is Date");
        } else  {
            System.out.println("This String Not an Email or IPV4 or Date");
        }
    }
}
