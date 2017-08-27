package home.practice.java.methods;

class BaseClass {
    public BaseClass(){
        System.out.println("BaseClass called");
    }
}
public class MethodsDemo extends  BaseClass{
    public MethodsDemo(String x){
        System.out.println("MethodDemo called");
    }
    public MethodsDemo() {
        this("Simple");
        System.out.println("MethodDemo called");
    }
    public static void main(String args[]) {
        MethodsDemo methodsDemo = new MethodsDemo();
        MethodsDemo methodsDemo2 = new MethodsDemo("Advance");

    }

}
