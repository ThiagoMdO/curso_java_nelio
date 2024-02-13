package secao10.model;

public class Employees {

    private final Integer id;

    private String name;

    private Double salary;

    public Employees(Integer id, String name, Double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public Double getSalary(){
        return salary;
    }

    public void setSalary(Double newSalary){
        this.salary = newSalary;
    }

    public String toString(){
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
