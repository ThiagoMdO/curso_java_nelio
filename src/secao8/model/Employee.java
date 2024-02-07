package secao8.model;

public class Employee {

    public String name;

    public double grossSalary;

    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void incrementSalary(double percentage){
        this.grossSalary += (this.grossSalary * percentage/100);
    }

    public String toString(){
        return this.name + ", R$ " + String.format("%.2f",netSalary());
    }
}
