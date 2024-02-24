package secao17.teste;

import secao17.model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProductRunner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many products do you want to registry? ");
        int qtdProducts = scanner.nextInt();
        scanner.nextLine();

        List<Product> products = new ArrayList<>();

        for (int i = 1; i <= qtdProducts; i++) {
            System.out.printf("Product Name #%d: ", i);
            String name = scanner.nextLine();

            System.out.printf("Product price #%d: ", i);
            Double price = scanner.nextDouble();

            System.out.printf("Product quantity #%d: ", i);
            Integer quantity = scanner.nextInt();
            scanner.nextLine();

            products.add(new Product(name, price, quantity));
        }

        System.out.println();
        System.out.print("Enter with the path: ");
        String strPath = scanner.nextLine();

        System.out.print("New folder name: ");
        String newFolder = scanner.nextLine();

        boolean success = new File(strPath, "\\" + newFolder).mkdir();
        System.out.println("Directory created successfully");

        System.out.println();
        System.out.print("Name of the File (no need extension): ");
        String strFileName = scanner.nextLine();

        String directoryWay = strPath + "\\" + newFolder + "\\" + strFileName + ".txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(directoryWay,true))) {
            for (Product product : products){
                bw.write(product.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try(BufferedReader br = new BufferedReader(new FileReader(directoryWay))){
            String line = br.readLine();

            String[] product = line.split(",");
            Double totalProduct = Double.parseDouble(product[1]) * Double.parseDouble(product[2]);
            List<String> listProducts = new ArrayList<>();
            System.out.println();

            while (line != null){
                listProducts.add(line);
                line = br.readLine();
            }
            for(int i = 0; i < listProducts.toArray().length; i++){
                String[] nomeProduct = listProducts.get(i).split(",");
                System.out.println(nomeProduct[0] + ", " + String.format("%.2f", totalProduct));
            }
        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
