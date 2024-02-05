package secao6;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Largura");
        double largura = scanner.nextDouble();

        System.out.println("Comprimento");
        double comprimento = scanner.nextDouble();

        System.out.println("Preço metro quadrado");
        double metroQuadrado = scanner.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f\n", area);
        System.out.printf("Preço = %.2f\n", preco);

        scanner.close();


    }
}
