package secao19.application;

import secao19.model.entities.Product;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProgramEstoqueMap {
    public static void main(String[] args) {
        Map<Product, Double> stoke = new LinkedHashMap<>();

        Product p1 = new Product("Tv", 2000.0);
        Product p2 = new Product("Forno", 1500.0);
        Product p3 = new Product("Torradeira", 15.0);

        stoke.put(p1, 10000.0);
        stoke.put(p2, 6000.0);
        stoke.put(p3, 90.0);

        Product ps = new Product("Tv", 2000.0);

        System.out.println("Contains 'ps' key: " + stoke.containsKey(p1));
    }
}
