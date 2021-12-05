package test;

public class test {
    public static void main(String[] args){
        System.out.println(model.checkEmail("xyz@"));
        System.out.println(model.checkEmail("xyz@."));
        System.out.println(model.checkEmail("xyz@gmail."));
        System.out.println(model.checkEmail("@gmail.com"));
        System.out.println(model.checkEmail("xyz@gmail.com"));

    }
}
