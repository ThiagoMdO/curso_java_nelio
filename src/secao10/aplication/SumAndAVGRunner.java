package secao10.aplication;

import secao10.model.SumAndAVGClass;

import java.util.Locale;
import java.util.Scanner;

public class SumAndAVGRunner {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int qtdNumeros = scanner.nextInt();
        double sum = 0;
        double avg = 0;

        SumAndAVGClass sumAndAVGClass = new SumAndAVGClass(new Double[qtdNumeros]);

        for(int i = 0; i < sumAndAVGClass.getNumbers().length; i++){
            System.out.print("Digite um número: ");
            double num = scanner.nextDouble();
            sumAndAVGClass.setNumbers(num, i);

            sum += num;
        }

        avg = sum/sumAndAVGClass.getNumbers().length;

        System.out.print("VALORES = ");
        for(int i = 0; i < sumAndAVGClass.getNumbers().length; i++){
            System.out.print(sumAndAVGClass.getOnlyNumber(i) + " ");
        }

        System.out.println();
        System.out.printf("SOMA = %.2f\n", sum);
        System.out.printf("MEDIA = %.2f\n", avg);

        scanner.close();
    }
}
