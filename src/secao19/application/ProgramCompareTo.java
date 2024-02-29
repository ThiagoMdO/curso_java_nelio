package secao19.application;

import secao19.model.entities.Product;

import java.util.Set;
import java.util.TreeSet;

public class ProgramCompareTo {
    public static void main(String[] args) {

        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 1000.2));
        set.add(new Product("Notebook", 454.2));
        set.add(new Product("Tablet", 841.2));

        for (Product p : set){
            System.out.println(p);
        }
    }
}
