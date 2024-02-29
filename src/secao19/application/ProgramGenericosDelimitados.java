package secao19.application;

import secao19.model.entities.Employee;
import secao19.model.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ProgramGenericosDelimitados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Employee> list = new ArrayList<>();

        String path = "C:\\Users\\User\\Desktop\\uniasselvi\\nomes.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Employee x = CalculationService.max(list);
            System.out.println("Employee with the biggest salary: ");
            System.out.println(x);


        }
        catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
