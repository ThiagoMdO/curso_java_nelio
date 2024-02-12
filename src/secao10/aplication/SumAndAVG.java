package secao10.aplication;

import java.util.Locale;
import java.util.Scanner;

public class SumAndAVG {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas números você vai digitar? ");
        int qtdNumbers = scanner.nextInt();

        double[] numbersOperation = new double[qtdNumbers];
        double sum = 0;

        for (int i = 0; i < qtdNumbers; i++) {
            System.out.print("Digite um número: ");
            double num = scanner.nextDouble();

            numbersOperation[i] = num;
            sum += num;
        }

        double avg = sum/numbersOperation.length;

        System.out.print("VALORES = ");
        for (int i = 0; i < qtdNumbers; i++) {
            System.out.print(numbersOperation[i] + " ");
        }

        System.out.println();
        System.out.printf("SOMA = %.2f\n", sum);
        System.out.printf("MEDIA = %.2f\n", avg);

        scanner.close();
    }
}
