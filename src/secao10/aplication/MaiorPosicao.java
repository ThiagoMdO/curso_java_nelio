package secao10.aplication;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int qtdNumeros = scanner.nextInt();

        double[] maiorValor = new double[qtdNumeros];

        double maiorValorNum = 0;
        int posicaoMaiorNum = 0;

        for (int i = 0; i < qtdNumeros; i++) {
            System.out.print("Digite um número: ");
            maiorValor[i] = scanner.nextDouble();
        }

        for (int i = 0; i < maiorValor.length; i++) {
            if (maiorValorNum < maiorValor[i]) {
                maiorValorNum = maiorValor[i];
                posicaoMaiorNum = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maiorValorNum);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicaoMaiorNum);

        scanner.close();
    }
}
