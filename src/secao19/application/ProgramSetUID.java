package secao19.application;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSetUID {
    public static void main(String[] args) {
        Set<Integer> a = new TreeSet<>(Arrays.asList(1,4,6,8,16));
        Set<Integer> b = new TreeSet<>(Arrays.asList(5,2,6,8,16,13));

        //union
        Set<Integer> c = new TreeSet<>(a);
        c.addAll(b);
        System.out.println(c);


        //intersection
        Set<Integer> d = new TreeSet<>(a);
        d.retainAll(b);
        System.out.println(d);


        //difference
        Set<Integer> e = new TreeSet<>(a);
        e.removeAll(b);
        System.out.println(e);
    }
}
