package secao19.application;

import java.util.Arrays;
import java.util.List;

public class ProgramTiposCuringa {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 4, 6, 7);
        printList(myInts);

        List<String> myStr = Arrays.asList("Anna", "Maria", "Joao");
        printList(myStr);
    }

    public static void printList(List<?> list){
        for(Object obj : list){
            System.out.println(obj);
        }
    }
}
