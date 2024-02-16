package secao13.aplication;

import secao13.enuns.WorkerLevel;
import secao13.model.entity.Department;
import secao13.model.entity.HourContract;
import secao13.model.entity.Worker;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class WorkerRunner {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String department = scanner.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Level: ");
        String level = scanner.nextLine();

        System.out.print("Base salary: ");
        Double baseSalary = scanner.nextDouble();
        scanner.nextLine();

        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, new Department(department));


        System.out.print("How many contracts to this worker? ");
        int qtdContracts = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < qtdContracts; i++) {
            System.out.printf("Enter contract #%d data: \n", i + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            String data = scanner.nextLine();

            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();

            System.out.print("Duration (hours): ");
            int hour = scanner.nextInt();

            HourContract hourContract = new HourContract(LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy")), valuePerHour, hour);

            worker.addContract(hourContract);

            scanner.nextLine();
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String data1 = "01/";
        data1 += scanner.nextLine();
        LocalDate dataMonthYear = LocalDate.parse(data1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Double valorAtualizado = worker.income(dataMonthYear.getYear(), dataMonthYear.getMonthValue());
        System.out.println(worker);
        System.out.printf("Income for %s: %.2f", data1.substring(3), valorAtualizado);

        scanner.close();

    }
}
