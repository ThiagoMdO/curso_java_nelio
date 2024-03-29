package secao18.model.services;

public class PaymentService implements OnlinePaymentService {
    @Override
    public Double payment(Double amount) {
        return amount * 0.02;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        if (amount <= 0 || months <= 0) {
            throw new IllegalStateException("Os valores estão incorretos");
        }
        return amount * months * 0.01;
    }
}
