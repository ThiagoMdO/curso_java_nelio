package secao9.teste;

import secao9.model.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductRunner {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter product data");
        System.out.print("Name: ");
        String name = scanner.next();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.print("Product data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantidade = scanner.nextInt();
        product.addProducts(quantidade);
        System.out.println();
        System.out.print("Updated data: " + product);


        System.out.println();
        System.out.print("Enter the number of products to be remove from stock: ");
        quantidade = scanner.nextInt();
        product.removeProducts(quantidade);
        System.out.println();
        System.out.print("Updated data: " + product);

        scanner.close();

    }
}
