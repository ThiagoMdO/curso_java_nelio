package secao10.aplication;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor? ");
        int qtdValoresVetores = scanner.nextInt();
        int[] a = new int[qtdValoresVetores];
        int[] b = new int[qtdValoresVetores];
        int[] c = new int[qtdValoresVetores];

        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.println("VETOR RESULTANTE");
        for (int i = 0; i < qtdValoresVetores; i++){
            c[i] = a[i] + b[i];
            System.out.println(c[i]);
        }

        scanner.close();
    }
}
