package secao10.aplication;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qtdNumeros = scanner.nextInt();
        double[] numerosPares = new double[qtdNumeros];
        int countNumbers = 0;
        for (int i = 0; i < qtdNumeros; i++) {
            System.out.print("Digite um número: ");
            double enteredNumbers = scanner.nextInt();
            if (enteredNumbers % 2 == 0 && enteredNumbers != 0) {
                numerosPares[i] = enteredNumbers;
                countNumbers++;
            }
        }
        System.out.println();
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < numerosPares.length; i++){
            if(numerosPares[i] % 2 == 0 && numerosPares[i] != 0){
                System.out.printf("%.0f ",numerosPares[i]);
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("QUANTIDA DE DE PARES = " + countNumbers);

        scanner.close();

    }
}
