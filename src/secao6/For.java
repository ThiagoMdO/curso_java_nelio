package secao6;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero de contas");
        int n = scanner.nextInt();

        int soma = 0;
        for (int i = 1; i <= n; i++) {

            System.out.printf("conta numero %d de %d\n",i,n);
            int x = scanner.nextInt();
            System.out.printf("A soma de %d + %d = %d \n",soma,x,(soma+x));
            soma += x;
        }

        scanner.close();
    }
}
