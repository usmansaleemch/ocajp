package home.practice.java.methods;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class OverridingDemo {

    public static void main(String... args) {
       List<Character> x = new ArrayList<>();
       x.add('A');
       x.add('C');
        x.set(1,'B');
       x.remove(0);
        System.out.println(x);
       System.out.println(x.size());

        String name = new String("Usman");
        System.out.println(name.replace('s','b'));

        // Predicate
        List<String> addremove = new ArrayList<>();
        addremove.add("A");
        addremove.add("B");
        addremove.add("C");
        addremove.remove(2);
        System.out.println(addremove);

        LocalDate localDate = LocalDate.of(2017,1,1);

        Period period = Period.ofDays(1);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM-dd-yyyy");
        System.out.println(dateTimeFormatter.format(localDate.minus(period)));

        List xs = new ArrayList<>();
        
        String one = "b";
        String two = "lack";
        one = one.concat(two);
        System.out.println(one);





    }


}
