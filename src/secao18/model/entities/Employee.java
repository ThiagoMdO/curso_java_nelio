package secao18.model.entities;

public class Employee implements Comparable<Employee>{

    private String name;

    private Double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

//    @Override
//    public int compareTo(Employee otherObj){
//        return name.compareTo(otherObj.getName());
//    }
    @Override
    public int compareTo(Employee otherObj){
        return - salary.compareTo(otherObj.getSalary());
    }
}
