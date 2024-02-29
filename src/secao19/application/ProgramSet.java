package secao19.application;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSet {
    public static void main(String[] args) {
        //A class HashSet bem rapido, porem não ordena os itens na ordem de incremento
//        Set<String> set = new HashSet<>();

        //A class TreeSet ordena por ordem alfabefica alfanumeria, e se é maiuscula e minuscula importa na hora de ordernar
//        Set<String> set = new TreeSet<>();

        // a class LinkedHashSet mantem a ordem que os elementos foram incrementados
        Set<String> set = new LinkedHashSet<>();


        set.add("TV");
        set.add("MP3");
        set.add("Radio");
        set.add("Radio Bateria");
        set.add("Bateria");
        //Não é possivel acrescentar um dado duplicado
        set.add("Bateria");

        set.remove("Bateria");
        set.removeIf(x -> x.length() > 3);
        set.removeIf(x -> x.charAt(0) == 'T');

        System.out.println(set.contains("TV"));

        for (Object obj : set){
            System.out.println(obj);
        }

        set.removeAll(set);


        for (Object obj : set){
            System.out.println(obj);
        }

    }
}
