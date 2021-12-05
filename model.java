package test;

public class model {
    private static String[] special = {"@", ".", "&", "*", "!", "^"};

    public static Boolean checkEmail(String email){
        if (email.contains(special[0])){
            return true;
        }


        return false;
    }

}
