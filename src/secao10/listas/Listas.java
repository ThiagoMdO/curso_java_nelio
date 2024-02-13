package secao10.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("3");
        list.add("6");
        list.add("78");

        for (String obj : list) {
            System.out.println(obj);
        }

        System.out.println(list.size());
        System.out.println();
        list.add(2, "33");

        for (String obj : list) {
            System.out.println(obj);
        }
        System.out.println(list.size());


        System.out.println();
        list.remove("33");
        for (String obj : list) {
            System.out.println(obj);
        }

        System.out.println();
        list.remove(1);
        for (String obj : list) {
            System.out.println(obj);
        }

        System.out.println();

        list.add("Maria");
        list.add("Marcos");
        list.add("Rosana");

        for (String obj : list) {
            System.out.println(obj);
        }
        list.removeIf(x -> x.charAt(0) == 'M');

        System.out.println();
        for (String obj : list) {
            System.out.println(obj);
        }

        System.out.println("Index of Rosana: " + list.indexOf("Rosana"));
        System.out.println("Index of Mario: " + list.indexOf("Mario"));


        list.add("Mario");
        list.add("Maria");
        list.add("Mariano");
        list.add("Roberto");
        System.out.println("Index of Mario: " + list.indexOf("Mario"));

        System.out.println("----------------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

        for (String obj: result){
            System.out.println(obj);
        }

        System.out.println("----------------------");

        String name = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);

        System.out.println(name);

    }
}
