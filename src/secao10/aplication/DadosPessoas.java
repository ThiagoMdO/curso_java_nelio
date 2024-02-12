package secao10.aplication;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int qtdPessoas = scanner.nextInt();

        double[] alturaPessoa = new double[qtdPessoas];
        Character[] generoPessoa = new Character[qtdPessoas];

        double menorAltura;
        double maiorAltura;

        double sumAlturaMulheres = 0;
        double mediaAlturaMulheres;
        int dividirMulheres = 0;

        int numeroHomens = 0;

        int indiceComparativo = 0;

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.printf("Altura da %da pessoa: ", i + 1);
            alturaPessoa[i] = scanner.nextDouble();

            System.out.printf("Genero da %da pessoa: ", i + 1);
            generoPessoa[i] = scanner.next().charAt(0);
        }

        for (int i = 0; i < qtdPessoas; i++) {
            if (alturaPessoa[i] < alturaPessoa[indiceComparativo]) {
                indiceComparativo = i;
            }
        }

        menorAltura = alturaPessoa[indiceComparativo];

        indiceComparativo = 0;
        for (int i = 0; i < qtdPessoas; i++) {
            if (alturaPessoa[i] > alturaPessoa[indiceComparativo]) {
                indiceComparativo = i;
            }
        }

        maiorAltura = alturaPessoa[indiceComparativo];


        for (int i = 0; i < qtdPessoas; i++) {
            if (generoPessoa[i] == 'F' || generoPessoa[i] == 'f') {
                sumAlturaMulheres += alturaPessoa[i];
                dividirMulheres++;
            }
            if (generoPessoa[i] == 'M' || generoPessoa[i] == 'f'){
                numeroHomens++;
            }
        }

        if(dividirMulheres <= 0){
            dividirMulheres = 1;
        }
        mediaAlturaMulheres = sumAlturaMulheres / dividirMulheres;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Media da altura das mulheres = %.2f \n", mediaAlturaMulheres);
        System.out.printf("Número de homens = %d \n", numeroHomens);
    }
}
