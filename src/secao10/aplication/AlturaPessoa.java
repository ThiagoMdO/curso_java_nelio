package secao10.aplication;

import java.util.Locale;
import java.util.Scanner;

public class AlturaPessoa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos pessoas serão digitados: ");
        int qtdPessoas = scanner.nextInt();

        String[] nome = new String[qtdPessoas];
        int[] idade = new int[qtdPessoas];
        double[] altura = new double[qtdPessoas];
        double sum = 0;
        double avg;
        double menores16 = 0;

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);

            scanner.nextLine();

            System.out.print("Nome: ");
            nome[i] = scanner.nextLine();

            System.out.print("Idade: ");
            idade[i] = scanner.nextInt();

            System.out.print("Altura: ");
            altura[i] = scanner.nextDouble();

            if (idade[i] < 16) {
                menores16++;
            }
        }

        for (int i = 0; i < altura.length; i++) {
            sum += altura[i];
        }

        avg = sum / altura.length;

        menores16 *= 100 / idade.length;

        System.out.printf("Altura média %.2f \n", avg);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%% \n", menores16);
        for (int i = 0; i < altura.length; i++){
            if(idade[i] < 16){
                System.out.println(nome[i]);
            }
        }
        scanner.close();
    }


}
