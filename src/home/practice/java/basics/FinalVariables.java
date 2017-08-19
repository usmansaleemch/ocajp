package home.practice.java.basics;

public class FinalVariables {
    final int end;

    public FinalVariables() {
        end = 10;
    }
    public static void main(String... args){
        FinalVariables finalVariables = new FinalVariables();
        System.out.println(finalVariables.end);
    }
}
