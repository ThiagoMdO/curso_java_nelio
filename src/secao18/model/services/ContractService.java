package secao18.model.services;

import secao18.model.entities.Contract;
import secao18.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        Double basicQuot = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            Double interest = onlinePaymentService.interest(basicQuot, i);
            Double fee = onlinePaymentService.payment(basicQuot + interest);
            Double quota = basicQuot + interest + fee;

            contract.addInstallments(new Installment(dueDate, quota));

        }
        for (Installment obj : contract.getInstallments()){
            System.out.println(obj);
        }
    }
}
