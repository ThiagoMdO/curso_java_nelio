package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class TestScanner {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

//        String x = scanner.next();

//        Integer x = scanner.nextInt();

//        double x1;

//        x1 = scanner.nextDouble();

//        char x;
//        x = scanner.next().charAt(1);
//
//        System.out.println("você digitou "+x);

        String x;
        int y;
        double z;

        x = scanner.next();
        y = scanner.nextInt();
        z = scanner.nextDouble();

        System.out.printf("valores x = %s, y = %d e z = %.2f\n", x, y, z);


        scanner.close();
    }



}
