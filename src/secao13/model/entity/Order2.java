package secao13.model.entity;

import secao13.enuns.OrderStatus2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order2 {

    private LocalDateTime moment;

    private OrderStatus2 status;

    private final List<OrderItem2> items = new ArrayList<>();

    public Order2(LocalDateTime moment, OrderStatus2 status){
        this.moment = moment;
        this.status = status;
    }

    public LocalDateTime getMoment(){
        return moment;
    }

    public void setMoment(LocalDateTime newMoment){
        this.moment = newMoment;
    }

    public OrderStatus2 getStatus(){
        return status;
    }

    public void setStatus(OrderStatus2 newStatus){
        this.status = newStatus;
    }

    public List<OrderItem2> getItems(){
        return items;
    }

    public void addOrderItem2(OrderItem2 orderItem2){
        this.items.add(orderItem2);
    }

    public void removeOrderItem2(OrderItem2 orderItem2){
        this.items.add(orderItem2);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(getMoment().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "\n");
        sb.append("Order status: ");
        sb.append(getStatus());
        return sb.toString();
    }

}
