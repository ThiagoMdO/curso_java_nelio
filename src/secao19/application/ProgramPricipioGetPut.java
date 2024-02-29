package secao19.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramPricipioGetPut {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 32, 5, 4);
        List<Double> myDoubles = Arrays.asList(1.4, 5.0, 7.5, 9.8);
        List<String> myStr = Arrays.asList("aria", "Anna", "Mario");
        List<Object> myObjects = new ArrayList<>();

        copy(myInts, myObjects);
        printList(myObjects);

        copy(myDoubles, myObjects);
        printList(myObjects);

//        copy(myStr, myObjects);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for (Number number : source){
            destiny.add(number);
        }
    }

    public static void printList(List<?> list){
        for (Object obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
