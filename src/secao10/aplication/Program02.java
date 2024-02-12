package secao10.aplication;

import secao10.model.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Product[] products = new Product[n];

        for(int i = 0; i < products.length; i++){
            scanner.nextLine();
            String name = scanner.nextLine();
            double price = scanner.nextDouble();
            products[i] = new Product(name,price);
        }

        double sum = 0.0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        }

        double avg = sum / n;

        System.out.printf("AVG Products = %.2f\n", avg);


        scanner.close();
    }
}
