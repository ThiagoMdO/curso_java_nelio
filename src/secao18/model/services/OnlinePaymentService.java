package secao18.model.services;

public interface OnlinePaymentService {

    Double dado = 10.0;

    Double payment(Double amount);

    Double interest(Double amount, Integer months);
}
