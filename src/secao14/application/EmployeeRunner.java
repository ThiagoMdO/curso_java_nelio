package secao14.application;

import secao14.entities.Employee;
import secao14.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class EmployeeRunner {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int qtdEmployees = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < qtdEmployees; i++){
            System.out.printf("Employee #%d data:", i + 1);
            System.out.print("Outsourced (y/n)? ");
            Character inOut = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Hours: ");
            Integer hours = scanner.nextInt();


            System.out.print("Value per hour: ");
            Double valuePerHour = scanner.nextDouble();

            if(inOut == 'y'){
                System.out.print("Additional charge: ");
                Double additionalCharge = scanner.nextDouble();

                employeeList.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
            if(inOut == 'n'){
                Employee employee = new Employee(name, hours, valuePerHour);
                employeeList.add(employee);
            }

            scanner.nextLine();
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for(Employee obj : employeeList){
            System.out.println(obj);
        }

    }
}
