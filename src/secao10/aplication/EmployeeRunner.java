package secao10.aplication;

import secao10.model.Employees;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeRunner {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employees> employees = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int qtdEmployees = scanner.nextInt();

        for (int i = 0; i < qtdEmployees; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1));
            scanner.nextLine();

            System.out.print("Id: ");
            Integer id = scanner.nextInt();

            while(hasId(employees, id)){
                System.out.println("Id already taken! Try again");
                id = scanner.nextInt();
            }
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();
            while(hasName(employees, name)){
                System.out.println("This name is taken, please try another");
                name = scanner.nextLine();
            }

            System.out.print("Salary: ");

            Double salary = scanner.nextDouble();

            employees.add(new Employees(id, name, salary));

        }

        System.out.println();

        System.out.print("Enter the employee id that will have salary increase: ");
        int getId = scanner.nextInt();

        Employees emp = employees.stream().filter(x -> x.getId() == getId).findFirst().orElse(null);

        if (emp == null) {
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            Double percentage = scanner.nextDouble();

            Double calcSalary = emp.getSalary() + (emp.getSalary() * percentage / 100);
            emp.setSalary(calcSalary);

        }

        System.out.println("List of employees:");
        for (Employees e : employees) {
            System.out.println(e);
        }

        scanner.close();
    }

    public static Integer position(List<Employees> list, int id) {
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        return null;
    }

    public static boolean hasId(List<Employees> list, int id){
        Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

    public static boolean hasName(List<Employees> list, String name){
        Employees employees = list.stream().filter(x -> Objects.equals(x.getName(), name)).findFirst().orElse(null);
        return employees != null;
    }
}
