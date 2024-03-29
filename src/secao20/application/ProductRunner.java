package secao20.application;

import secao20.model.intities.Product;
import secao20.model.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProductRunner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("Hd case", 89.90));

        ProductService ps = new ProductService();

//        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'M');
        double sum = ps.filteredSum(list, p -> p.getPrice() > 100);

        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
