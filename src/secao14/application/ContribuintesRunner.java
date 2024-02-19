package secao14.application;

import secao14.entities.Contribuintes;
import secao14.entities.ContribuitePessoaJuridica;
import secao14.entities.ContribuitePessosFisica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class ContribuintesRunner {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Contribuintes> contribuintesList = new ArrayList<>();

        System.out.print("Enter the numbers of tax payers: ");
        int qtdContribuintes = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= qtdContribuintes; i++) {
            System.out.printf("Tax payer #%d data: \n", i);
            System.out.print("Individual or company (i/c)? ");
            char iC = scanner.nextLine().charAt(0);

            while (iC != 'i' && iC != 'c') {
                System.out.print("Individual or company (i/c)? ");
                iC = scanner.nextLine().charAt(0);
            }

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Anual income: ");
            Double income = scanner.nextDouble();
            scanner.nextLine();

            if (iC == 'i') {
                System.out.print("Health expenditures: ");
                Double health = scanner.nextDouble();
                scanner.nextLine();

                Contribuintes contribuintes = new ContribuitePessosFisica(name, income, health);

                contribuintesList.add(contribuintes);
            }
            if (iC == 'c') {
                System.out.print("Number of employees: ");
                Integer numerosFuncionarios = scanner.nextInt();
                scanner.nextLine();

                Contribuintes contribuintes = new ContribuitePessoaJuridica(name, income, numerosFuncionarios);

                contribuintesList.add(contribuintes);
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        Double totImpost = 0.0;
        for (Contribuintes obj : contribuintesList) {
            totImpost += obj.imposto();
            System.out.println(obj.getNome() + ": $ " + String.format("%.2f", obj.imposto()));
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totImpost));

    }
}
