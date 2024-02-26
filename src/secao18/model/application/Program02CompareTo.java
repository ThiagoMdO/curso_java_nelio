package secao18.model.application;
import secao18.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Program02CompareTo {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        String path = "C:\\Users\\User\\Desktop\\uniasselvi\\nomes.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCSV = br.readLine();
            while (employeeCSV != null) {
                String[] fields = employeeCSV.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCSV = br.readLine();
            }
            Collections.sort(list);
            for (Employee e : list) {
                System.out.println(e.getName() + ", " + e.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
