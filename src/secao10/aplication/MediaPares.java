package secao10.aplication;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int qtdElementsVector = scanner.nextInt();
        double[] vector = new double[qtdElementsVector];
        double sum = 0;
        double qtdNunsPar = 0;
        double avgVector;

        for (int i = 0; i < qtdElementsVector; i++) {
            System.out.print("Digite um número: ");
            vector[i] = scanner.nextDouble();
        }

        for (int i = 0; i < vector.length; i++){
            if(vector[i] % 2 == 0){
                sum += vector[i];
                qtdNunsPar++;
            }
        }
        if(sum == 0){
            System.out.println("NENHUM NUMERO PAR");
        }else{
            avgVector = sum / qtdNunsPar;
            System.out.println("MEDIA DOS PARES = " + avgVector);

        }

    }
}
