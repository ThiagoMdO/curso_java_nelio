package secao18.model.application;

import secao18.model.entities.CarRental;
import secao18.model.entities.Vehicle;
import secao18.model.services.BrazilTaxService;
import secao18.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter ftm = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String model = scanner.nextLine();

        System.out.print("Retirada (dd/mm/yyyy hh:mm): ");
        LocalDateTime dataRetirada = LocalDateTime.parse(scanner.nextLine(), ftm);

        System.out.print("Retorno (dd/mm/yyyy hh:mm): ");
        LocalDateTime dataRetorno = LocalDateTime.parse(scanner.nextLine(), ftm);

        CarRental carRental = new CarRental(dataRetirada, dataRetorno, new Vehicle(model));

        System.out.print("Entre com o preço por hora: ");
        Double precoHora = scanner.nextDouble();

        System.out.print("Entre com preço por dia: ");
        Double precoDia = scanner.nextDouble();

        RentalService rentalService = new RentalService(precoDia, precoHora, new BrazilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println("FATURA:");
        System.out.println("Basic payment: " + String.format("%.2f",carRental.getInvoice().getBasicPayment()));
        System.out.println("Impost: " + String.format("%.2f",carRental.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f",carRental.getInvoice().getTotalPayment()));

        scanner.close();
    }
}
