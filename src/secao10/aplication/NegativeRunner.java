package secao10.aplication;

import secao10.model.Numbers;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class NegativeRunner {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int qtsNumebers = scanner.nextInt();

        Double[] vertNumbers = new Double[qtsNumebers];

        Arrays.fill(vertNumbers, 0.0);

        Numbers numbers = new Numbers(vertNumbers);

        int contador = 0;

        for (int i = 0; i < vertNumbers.length; i++) {
            System.out.print("Digite um numero: ");
            Double num = scanner.nextDouble();
            if (num < 0) {
                numbers.setNumers(num, i);
                contador++;
            }
        }

        Numbers numbersNegative = new Numbers(new Double[contador]);

        int j = 0;
        for (int i = 0; i < vertNumbers.length; i++) {
            if (numbers.getOnlyNumber(i) < 0.0 || numbers.getOnlyNumber(i) != 0.0) {
                numbersNegative.setNumers(numbers.getOnlyNumber(i), j);
                j++;
            }
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (int k = 0; k < contador; k++) {
            System.out.println(numbersNegative.getOnlyNumber(k));
        }
        scanner.close();
    }
}
