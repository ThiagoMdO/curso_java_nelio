package secao8.teste;

import secao8.util.Calculator02;

import java.util.Locale;
import java.util.Scanner;

public class Raio02Runner {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Calculator02 calculator = new Calculator02();

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        double c = calculator.circumference(radius);
        double v = calculator.volume(radius);

        System.out.printf("Circumference: %.2f\n", c);
        System.out.printf("Volume: %.2f\n", v);
        System.out.printf("PI value: %.2f\n", calculator.PI);


    }

}
