package secao7;

import java.util.Scanner;

public class Program2 {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        scanner.close();
    }

    public static int max(int a, int b, int c) {

        int maior;

        if (a > b && a > c) {
            maior = a;
        } else if (b > c) {
            maior = b;
        } else {
            maior = c;
        }
        return maior;
    }

    public static void showResult(int higher){

        System.out.println("O resultado é: " + higher);
    }
}
