package test;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class model {
    private static Pattern mail = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");
    private static Pattern pass = Pattern.compile("^(?=.*?[a-zA-Z])(?=.*?[0-9])(?=.*?[*^&@!.]).{7,}$");

    public static Boolean checkEmail(String email){
        Matcher match = mail.matcher(email);
        return match.matches();
    }

    public static Boolean checkPassword(String password){
        Matcher match = pass.matcher(password);
        return match.matches();
    }

}
