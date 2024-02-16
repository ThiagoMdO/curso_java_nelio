package secao13.model.entity;

import secao13.enuns.WorkerLevel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Worker {

    private Long id = 1L;

    private String name;

    private WorkerLevel level;

    private Double baseSalary;

    private Department department;

    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department){
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public WorkerLevel getLevel(){
        return level;
    }

    public void setLevel(WorkerLevel newLevel){
        this.level = newLevel;
    }

    public Double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(Double newBaseSalary){
        this.baseSalary = newBaseSalary;
    }

    public Department getDepartment(){
        return department;
    }

    public void setDepartment(Department newDepartment){
        this.department = newDepartment;
    }

    public List<HourContract> getContracts(){
        return this.contracts;
    }

    public void addContract(HourContract addContract){
        this.contracts.add(addContract);
    }

    public void removeContract(HourContract removeContract){
        this.contracts.remove(removeContract);
    }

    public Double income(Integer year, Integer month){
        Double sum = getBaseSalary();
        for(HourContract e : contracts){
            int eYear = e.getDateTime().getYear();
            int eMonth = e.getDateTime().getMonthValue();
            if(eYear == year && eMonth == month){
                sum += e.totalValue();
            }
        }
        return sum;
    }


    public String toString(){
        return "Name: " + name + "\n" +
                "Department: " + department;
    }

}
