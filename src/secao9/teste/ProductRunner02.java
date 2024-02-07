package secao9.teste;

import secao9.model.Product;
import secao9.model.Product02;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class ProductRunner02 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data");
        System.out.print("Name: ");
        String name = scanner.next();

        Product02 product02 = new Product02(name);

        System.out.print("Enter price: ");
        double newPrice = scanner.nextDouble();
        product02.setPrice(newPrice);

        System.out.print("Enter quantity");
        int newQuantity = scanner.nextInt();

        System.out.println(product02.toString());

        System.out.println(product02.getName());
        System.out.println(product02.getName());
        System.out.println(product02.getName());
        scanner.close();
    }
}
