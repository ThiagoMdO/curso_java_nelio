package secao10.aplication;

import java.util.Scanner;

public class Matrizes2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de linhas: ");
        int linhas = scanner.nextInt();

        System.out.print("Número de colunas: ");
        int colunas = scanner.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Qual numero você quer procurar? ");
        int x = scanner.nextInt();

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] == x) {
                    System.out.printf("Position %d,%d:\n", i, j);
                    if (j > 0) {
                        System.out.println("Left: " + matriz[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("UP: " + matriz[i - 1][j]);
                    }
                    if (j < matriz[i].length - 1) {
                        System.out.println("Right: " + matriz[i][j + 1]);
                    }
                    if (i < matriz.length - 1){
                        System.out.println("Down: " + matriz[i+1][j]);
                    }

                }
            }
        }

    }
}
