package secao6;

import java.util.Scanner;

public class While {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        int numero = scanner.nextInt();
        while(numero != 0){
            soma += numero;
            numero = scanner.nextInt();
        }
        System.out.println(soma);

        scanner.close();
    }
}
