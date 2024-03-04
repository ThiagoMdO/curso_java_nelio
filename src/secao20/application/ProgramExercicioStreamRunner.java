package secao20.application;

import secao20.model.intities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramExercicioStreamRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter full file path:");
        // C:\Users\User\Desktop\Uniasselvi\produtos.txt
        String path = scanner.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            List<Product> list = new ArrayList<>();

            String line = br.readLine();

            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            Double avgProducts = list.stream()
                                .map(p -> p.getPrice())
                                .reduce(0.0, (x, y) -> x + y) / list.size();

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> products = list.stream()
                                    .filter(p -> p.getPrice() < avgProducts)
                                    .map(p -> p.getName())
                                    .sorted(comp.reversed())
                                    .collect(Collectors.toList());

            System.out.println("Average price: " + String.format("%.2f", avgProducts));
            products.forEach(System.out::println);

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }finally {
            if(scanner != null){
                scanner.close();
            }
        }
    }
}
