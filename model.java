package test;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class model {
    private static String[] special = {"@", ".", "&", "*", "!", "^"};
    private static Pattern mail = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
    private static Pattern pass = Pattern.compile("");

    public static Boolean checkEmail(String email){
        Matcher match = mail.matcher(email);
        return match.matches();
    }



}
