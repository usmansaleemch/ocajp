package home.practice.java.arrays;

import java.util.Arrays;

public class ArrayDemo {

    static public void main (String... args) {
        // Array declared and initialized inline. No size needed
        String name ="Usman Chodhary";
        // String has length as method
        name.length();
        String[] names = new String[] {"Usman","Chodhary"};
        // Arrays have length as property; Not size() method exists in collections e.g ArrayList
        for (int x = 0 ; x < names.length; x++){
            System.out.println("Names "+names[x]);
        }
        // toString doesn't print array items; uses Arrays.toString(names)
        System.out.println(names);
        System.out.println(Arrays.toString(names));
        // 0 - Chodhary
        // 1 - Saleem     -1-1 = -2
        // 2 - Usman
        Arrays.sort(names);
        // binary Search returns integer which can not be assigned to String
        System.out.println(Arrays.binarySearch(names,"Saleeem"));

        accept(new String[]{"1","2"});
    }
        static public void accept(String[] args) {

        }
}
