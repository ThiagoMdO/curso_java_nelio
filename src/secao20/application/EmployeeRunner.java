package secao20.application;

import secao20.model.intities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter full file path: ");
        // C:\Users\User\Desktop\Uniasselvi\employees.txt
        String path = scanner.nextLine();

        System.out.print("Enter salary: ");
        Double salary = scanner.nextDouble();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            List<Employee> list = new ArrayList<>();

            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            List<String> emails = list.stream()
                                    .filter(p -> p.getSalary() > salary)
                                    .map(p -> p.getEmail())
                                    .sorted()
                                    .collect(Collectors.toList());

            Double sum = list.stream()
                            .filter(p -> p.getName()
                            .charAt(0) == 'M')
                            .map(p -> p.getSalary())
                            .reduce(0.0, (x, y) -> x+y);

            System.out.printf("Email of people whose salary is more than %.2f:", salary);
            System.out.println();
            emails.forEach(System.out::println);

            System.out.println("Sum of salary of people whose name starts with 'M': " + sum);




        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (scanner != null){
                scanner.close();
            }
        }


    }
}
