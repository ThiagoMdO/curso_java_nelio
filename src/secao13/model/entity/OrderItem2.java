package secao13.model.entity;

public class OrderItem2 {

    private Integer quantity;

    private Double price;

    private Product2 product2;

    public OrderItem2(Integer quantity, Double price){
        this.quantity = quantity;
        this.price = price;
    }

    public OrderItem2(Integer quantity, Double price, Product2 product2){
        this.quantity = quantity;
        this.price = price;
        this.product2 = product2;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(Integer newQuantity){
        this.quantity = newQuantity;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double newPrice){
        this.price = newPrice;
    }

    public Product2 getProduct2(){
        return product2;
    }

    public void setProduct2(Product2 newProduct2){
        this.product2 = newProduct2;
    }

    public Double subTotal(){
        return quantity * product2.getPrice();
    }


    public OrderItem2 get(){
        return this;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(getProduct2());
        sb.append(", Quantity: " + getQuantity());
        sb.append(", Subtotal: " + "$" + subTotal());
        return sb.toString();
    }
}
