package secao10.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter with numbers of positions to compare");
        int n = scanner.nextInt();
        double[] altura = new double[n];
        double averageHeight = 0;

        for(int i = 0; i < n; i++){
            System.out.println("Posisão " + i + ": ");
            altura[i] = scanner.nextDouble();
            averageHeight += altura[i];
        }

        averageHeight /= n;
        System.out.println("AVG: " + String.format("%.2f",averageHeight));

        scanner.close();

    }
}
