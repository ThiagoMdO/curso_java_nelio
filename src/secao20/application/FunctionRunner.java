package secao20.application;

import secao20.model.intities.Product;
import secao20.util.UperCaseNameProductFunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionRunner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("Hd case", 89.90));

        //Interface implementation
//        List<String> names = list.stream().map(new UperCaseNameProductFunction()).collect(Collectors.toList());

        //Reference Method with static method
//        List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

        //Reference Method without static method
//        List<String> names = list.stream().map(Product::nonStaticUpperCaseName).collect(Collectors.toList());

        //lambda expression declared
//        Function<Product, String> func = p -> {
//            return p.getName().toUpperCase();
//        };

//        Function<Product, String> func = p -> p.getName().toUpperCase();
//        List<String> names = list.stream().map(func).collect(Collectors.toList());


        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());


        names.forEach(System.out::println);
    }
}
