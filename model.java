package test;

public class model {
    private static String[] special = {"@", ".", "&", "*", "!", "^"};

    public static Boolean checkEmail(String email){
        if (email.contains(special[0]) && email.contains(special[1])){
            if (email.indexOf(special[1]) > email.indexOf(special[0])) {
                return true;
            }
        }


        return false;
    }

}
