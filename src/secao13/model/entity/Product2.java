package secao13.model.entity;

public class Product2 {

    private String name;

    private Double price;

    public Product2(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double newPrice) {
        this.price = price;
    }

    public Product2 get(){
        return this;
    }
    public String toString() {
        return name + ", " + "$" + price;
    }
}
