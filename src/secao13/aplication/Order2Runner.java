package secao13.aplication;

import secao13.enuns.OrderStatus2;
import secao13.model.entity.Client2;
import secao13.model.entity.Order2;
import secao13.model.entity.OrderItem2;
import secao13.model.entity.Product2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Order2Runner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        String dateBirthdayString = scanner.nextLine();

        LocalDate dateBirthDay = LocalDate.parse(dateBirthdayString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        Client2 client2 = new Client2(name, email, dateBirthDay);

        System.out.println();
        System.out.println("Enter order data: ");
        System.out.print("Status: ");

        OrderStatus2 status = OrderStatus2.valueOf(scanner.nextLine());
//        String status = scanner.nextLine();
//        OrderStatus2 orderStatus2 = OrderStatus2.PENDING_PAYMENT;
//
//        switch (status){
//            case "PENDING_PAYMENT":
//                orderStatus2 = OrderStatus2.PENDING_PAYMENT;
//                break;
//            case "PROCESSING":
//                orderStatus2 = OrderStatus2.PROCESSING;
//                break;
//            case "SHIPPED":
//                orderStatus2 = OrderStatus2.SHIPPED;
//                break;
//            case "DELIVERED":
//                orderStatus2 = OrderStatus2.DELIVERED;
//        }

        System.out.print("How many items to this order? ");
        int qtdProducts = scanner.nextInt();
        scanner.nextLine();

        Order2 order2 = new Order2(LocalDateTime.now(), status);

        for (int i = 0; i < qtdProducts; i++) {

            System.out.printf("Enter #%d item data: \n", (i + 1));
            System.out.print("Product name: ");
            String nameProduct = scanner.nextLine();

            System.out.print("Product price: ");
            Double priceProduct = scanner.nextDouble();

            System.out.print("Quantity: ");
            Integer quantityProducts = scanner.nextInt();
            scanner.nextLine();

            Product2 product2 = new Product2(nameProduct, priceProduct);

            OrderItem2 orderItem2 = new OrderItem2(quantityProducts, priceProduct, product2.get());

            order2.addOrderItem2(orderItem2.get());

        }


        System.out.println();
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order2);
        System.out.println(client2);
        System.out.println("Order items:");
        double sum = 0;
        for(OrderItem2 obj : order2.getItems()){
            sum += obj.subTotal();
            System.out.println(obj);
        }
        System.out.println("Total price: $" + String.format("%.2f",sum));

    }
}
