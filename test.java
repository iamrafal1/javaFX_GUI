package test;

public class test {
    public static void main(String[] args){
        System.out.println(model.checkPassword("xyz"));
        System.out.println(model.checkPassword("xyzxyzxyz"));
        System.out.println(model.checkPassword("xyzxyzxyz1"));
        System.out.println(model.checkPassword("111111111"));
        System.out.println(model.checkPassword("@@@@@@@@1"));
        System.out.println(model.checkPassword("xyzxyzxyz1@"));
    }
}
