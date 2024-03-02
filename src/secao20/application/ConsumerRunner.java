package secao20.application;

import secao20.model.intities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerRunner {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("Hd case", 89.90));

        //Interface implementation
//        list.forEach(new PriceUpdateProductConsumer());

        //Reference Method with static method
//        list.forEach(Product::staticPriceUpdate);

        //Reference Method without static method
//        list.forEach(Product::noStaticPriceUpdate);


        //lambda expression declared
//        Consumer<Product> cons = p -> {
//            //fazer mais de um comando, usar as chaves
//            p.setPrice(p.getPrice() * 1.1);
//        };
//        list.forEach(cons);

        //lambda expression inline
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));


        System.out.println();
        list.forEach(System.out::println);

//        for (int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }
//
//        System.out.println();
//        for (Product p : list){
//            System.out.println(p);
//        }
    }
}
