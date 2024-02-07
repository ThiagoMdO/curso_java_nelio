package secao8.teste;

import secao8.util.Calculator03;

import java.util.Locale;
import java.util.Scanner;


public class Raio03Runner {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = Calculator03.circumference(radius);

        double v = Calculator03.volume(radius);

        System.out.printf("Circumference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n", Calculator03.PI);


    }
}
