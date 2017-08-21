// By Default package imported is java.lang
package home.practice.java.basics;
// Public class should have same name as file name
public class JavaBasics {
    // Argument can be written as String... args | String[] args | String args[]
    // static and public can be swapped; static public void main
    int birds = 0;
    static public void main(String... args){
        // Static method can not access non static/instance variable without class instance
        //System.out.println(birds);

    }
}
