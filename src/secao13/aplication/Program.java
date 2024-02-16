package secao13.aplication;

import secao13.enuns.OrderStatus;
import secao13.model.entity.Order;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {

        Order order = new Order(1, LocalDateTime.parse("20/05/2023 01:30",DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);
    }
}
