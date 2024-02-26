package secao18.model.services;

public interface OnlinePaymentService {
    Double payment(Double amount);

    Double interest(Double amount, Integer months);
}
