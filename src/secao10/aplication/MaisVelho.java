package secao10.aplication;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int qtdPessoas, maioridade, posicaomaior;
        System.out.print("Quantas pessoas voce vai digitar? ");
        qtdPessoas = scanner.nextInt();
        String[] nome = new String[qtdPessoas];
        int[] idade = new int[qtdPessoas];

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.printf("Dados da %da pessoa: ", i + 1);
            System.out.println();
            scanner.nextLine();
            System.out.print("Nome: ");
            nome[i] = scanner.nextLine();

            System.out.print("Idade: ");
            idade[i] = scanner.nextInt();
        }

        maioridade = idade[0];
        posicaomaior = 0;

        for (int i = 0; i < qtdPessoas; i++) {
            if (idade[i] > maioridade) {
                maioridade = idade[i];
                posicaomaior = i;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + nome[posicaomaior]);

        scanner.close();

    }
}
