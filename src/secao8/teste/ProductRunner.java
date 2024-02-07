package secao8.teste;

import secao8.model.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductRunner {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data");
        System.out.println("Name: ");
        product.name = scanner.next();

        System.out.print("Price: ");
        product.price = scanner.nextDouble();

        System.out.print("Quantity: ");
        product.quantity = scanner.nextInt();

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




//        System.out.printf("Product data: %s, R$ %.2f, %d units, Total: R$ %.2f\n",product.name, product.price, product.quantity,product.totalValueInStock());
//
//        int quantidade = scanner.nextInt();
//        product.addProducts(quantidade);
//
//        System.out.printf("Updated data: %s, R$ %.2f, %d units, Total: R$ %.2f\n",product.name, product.price, product.quantity,product.totalValueInStock());
//
//        System.out.println("Enter the number of products to be removed from stock: ");
//        quantidade = scanner.nextInt();
//        product.removeProducts(quantidade);
//
//        System.out.printf("Updated data: %s, R$ %.2f, %d units, Total: R$ %.2f\n",product.name, product.price, product.quantity,product.totalValueInStock());

        scanner.close();

    }
}
