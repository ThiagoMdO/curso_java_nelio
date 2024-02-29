package secao19.model.entities;

import java.util.Objects;

public class Product implements Comparable<Product>{
    private String name;

    private Double price;

    private Integer quantity;

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price){
        this.price = price;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) && Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public int compareTo(Product other){
        return this.name.toLowerCase().compareTo(other.name.toLowerCase());
    }

    @Override
    public String toString(){
        return name + "," + price;
    }
}
