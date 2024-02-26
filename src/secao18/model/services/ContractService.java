package secao18.model.services;

import secao18.model.entities.Contract;
import secao18.model.entities.Installment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContractService {


    public static void processContract(Contract contract, Integer months) {
        LocalDate plusMonths = contract.getDate();
        for (int i = 1; i <= months; i++) {
            PaymentService paymentService = new PaymentService();
            double media = contract.getTotalValue() / months;

            Double tot = media + (paymentService.payment((media + paymentService.interest(media, i))) + paymentService.interest(media, i));

            Installment installment = new Installment(plusMonths, tot);
            contract.addInstallments(installment);

            System.out.print(plusMonths.plusMonths(i).format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " - ");

            System.out.print(String.format("%.2f", contract.getInstallments().get(i - 1).getAmount()));
            System.out.println();

        }
    }
}
