package secao18.model.services;

import secao18.model.entities.CarRental;
import secao18.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private Double pricePerDay;

    private Double pricePerHour;

    private TaxService taxService;

    public RentalService(Double pricePerDay, Double pricePerHour, TaxService taxService){
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental carRental){
        double duration = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = duration / 60.00;
        double days = hours / 24.00;

        double basicPayment;
        if(hours < 12){
            basicPayment = pricePerHour * Math.ceil(hours);
        }else{
            basicPayment = pricePerDay * Math.ceil(days);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
