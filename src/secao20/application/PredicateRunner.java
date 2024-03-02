package secao20.application;

import secao20.model.intities.Product;
import secao20.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateRunner {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 3000.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablry", 350.00));
        list.add(new Product("Hd case", 80.90));

        for (Product p : list){
            System.out.println(p);
        }

        System.out.println();

//        list.removeIf(x -> x.getPrice() < 90.00);

        //implementação da interface
//        list.removeIf(new ProductPredicate());

        //Reference Method com método estático
//        list.removeIf(Product::staticProductPredicate);

        //Reference Method sem método estático
//        list.removeIf(Product::nonStaticProductPredicate);

        //Expressão lambda declarada
//        Predicate<Product> pred = p -> p.getPrice() < 100.0;
//        list.removeIf(pred);

        list.removeIf(p -> p.getPrice() < 100.00);


        for (Product p : list){
            System.out.println(p);
        }
    }
}
