package secao10.aplication;

import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Main diagonal");
        for (int i = 0; i < n; i++){
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();

        System.out.println("invert diagonal");
        for(int i = n-1; i >= 0; i--){
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();

        int count = 0;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                count++;
            }
        }
        System.out.println("Negative numbers: " + count);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


        scanner.close();
    }
}
