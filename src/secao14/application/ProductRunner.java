package secao14.application;

import secao14.entities.ImportedProduct;
import secao14.entities.Product;
import secao14.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProductRunner {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int qtdProducts = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= qtdProducts; i++) {
            System.out.printf("Product #%d data: ", i);
            System.out.print("Common, used or imported? ");
            char typeProduct = scanner.nextLine().charAt(0);

            System.out.print("Name: ");
            String nameProduct = scanner.nextLine();

            System.out.print("Price: ");
            Double priceProduct = scanner.nextDouble();
            scanner.nextLine();

            switch (typeProduct) {
                case 'i' -> {
                    System.out.print("Custom fee: ");
                    Double fee = scanner.nextDouble();
                    Product product = new ImportedProduct(nameProduct, priceProduct, fee);
                    productList.add(product);
                    scanner.nextLine();
                }
                case 'u' -> {
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String data = scanner.nextLine();
                    LocalDate manufactureDate = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    Product product = new UsedProduct(nameProduct, priceProduct, manufactureDate);
                    productList.add(product);
                }
                default -> {
                    Product product = new Product(nameProduct, priceProduct);
                    productList.add(product);
                }
            }
        }

        for (Product obj : productList){
            System.out.println(obj.priceTag());
        }

        scanner.close();
    }
}
