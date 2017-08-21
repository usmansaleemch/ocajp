package home.practice.java.basics;

public class FinalVariables {
    // Should be initialized when declared but can be given value in
    // constructor or initializer block
    final int end;
    /**
     * Constructor initializes final primitives
     */
    public FinalVariables() {
        end = 10;
    }
    public static void main(String... args){
        FinalVariables finalVariables = new FinalVariables();
        System.out.println(finalVariables.end);
    }

    /**
     * May be called zero or one time
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
