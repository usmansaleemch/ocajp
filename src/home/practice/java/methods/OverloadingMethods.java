package home.practice.java.methods;

public class OverloadingMethods {

    public OverloadingMethods(){
        super();
    }

    public  int choice(int x){
        System.out.println("Int Called");
        return 1;
    }
    public  int choice(long x){
        System.out.println("Long Called");
        return 2;
    }
    public  int choice(short x){
        System.out.println("Short Called");
        return 5;
    }
    public static void main(String... args) {
        /***
         * Important + operator promotes types to int
         * (byte)6 will case 6 to byte;
         * to cast expression do (byte)(2+1)
         */
        new OverloadingMethods().choice((byte)(4+1));

    }
}
