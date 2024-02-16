package secao13.model.entity;

import secao13.enuns.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {

    private Integer id;

    private LocalDateTime moment;

    private OrderStatus status;

    public Order(){}

    public Order(Integer id, LocalDateTime moment, OrderStatus status){
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId(){
        return id;
    }

    public LocalDateTime getMoment(){
        return moment;
    }

    public void setMoment(LocalDateTime newMoment){
        this.moment = newMoment;
    }

    public OrderStatus getStatus(){
        return status;
    }

    public void setStatus(OrderStatus newStatus){
        this.status = newStatus;
    }

    public String toString(){
        return id + ", data: " + moment.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:ss")) + ", status: " + status;
    }
}
