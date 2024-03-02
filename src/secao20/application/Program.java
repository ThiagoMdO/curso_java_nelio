package secao20.application;

import secao20.model.intities.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 1500.0));
        list.add(new Product("Geladeira", 2500.0));
        list.add(new Product("Microondas", 500.0));

//        Collections.sort(list);

        // **** Comparator objeto de class separada *********
        //usando uma class externa
//        list.sort(new MyComparator());

        // **** Comparator objeto de class anônima *********
        //usando um comparator na execução do programa
//        Comparator<Product> comp = new Comparator<Product>() {
//            @Override
//            public int compare(Product p1, Product p2) {
//                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//            }
//        };

        // **** Comparator objeto de expressão lambda com chaves *********
        //usando expressão lambda, que é uma função anonima, com return (não é necessário)
//        Comparator<Product> comp = (p1, p2) ->{
//            return p1.getName().toUpperCase().compareTo(p2.getName().toLowerCase());
//        };

        // **** Comparator objeto de expressão lambda sem chaves *********
        //usando expressão lambda, que é uma função anonima, sem o return
//        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        // **** Comparator objeto de expressão lambda sem chaves *********
        //Usando expressão lambda, sintaxe mais moderno para comparar
//        Comparator<Product> comp = Comparator.comparing(p -> p.getName().toUpperCase());


        // **** Comparator expressão lambda "direto no argumento" *********
        //ordernar por ordem alfabetica, String
        list.sort(Comparator.comparing(p -> p.getName().toUpperCase()));

//        list.sort(Program::compareProduts);

        //ordenar por ordem alfanumerica Integer
        list.sort(Comparator.comparing(Product::getPrice));


        for (Product p : list) {
            System.out.println(p);
        }
    }
}
