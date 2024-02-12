package secao10.aplication;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtdVector = scanner.nextInt();
        double[] vetor = new double[qtdVector];
        double sum = 0;
        double mediaVector;

        for (int i = 0; i < qtdVector; i++){
            System.out.print("Digite um valor: ");
            vetor[i] = scanner.nextDouble();
            sum += vetor[i];
        }

        mediaVector = sum / vetor.length;

        System.out.println();
        System.out.println("MEDIA DO VETOR = " + mediaVector);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < mediaVector){
                System.out.println(vetor[i]);
            }
        }

    }
}
