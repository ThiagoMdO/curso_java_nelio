package secao18.model.application;

import secao18.model.entities.Contract;
import secao18.model.entities.Installment;
import secao18.model.services.ContractService;
import secao18.model.services.PaymentService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;


public class ContractRunner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        Integer numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(scanner.nextLine(), fmt);

        System.out.print("Valor do contrato: ");
        Double valorContrato = scanner.nextDouble();

        System.out.print("Entre com o numero de parcelas: ");
        Integer numerosParcelas = scanner.nextInt();


        Contract contract = new Contract(numero, data, valorContrato);

        ContractService service = new ContractService(new PaymentService());

        System.out.println("Parcelas: ");

        service.processContract(contract, numerosParcelas);

    }
}
