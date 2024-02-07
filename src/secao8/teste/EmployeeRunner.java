package secao8.teste;

import secao8.model.Employee;

import java.util.Locale;
import java.util.Scanner;

public class EmployeeRunner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("Enter with dados for employee");
        System.out.print("Name: ");
        employee.name = scanner.nextLine();

        System.out.print("GrossSalary: ");
        employee.grossSalary = scanner.nextDouble();

        System.out.print("Tax: ");
        employee.tax = scanner.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.println();
        System.out.print("Whith percentage to increment salary?");
        int newTax = scanner.nextInt();
        employee.incrementSalary(newTax);

        System.out.println("Update: " + employee);
    }
}
