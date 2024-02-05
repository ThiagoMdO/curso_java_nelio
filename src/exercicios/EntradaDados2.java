package exercicios;

import java.util.Scanner;

public class EntradaDados2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String s1, s2, s3;
        int x;

        x = scanner.nextInt();
        scanner.nextLine();
        s1 = scanner.nextLine();
        s2 = scanner.nextLine();
        s3 = scanner.nextLine();

        System.out.println(x);
        System.out.printf("Valores s1 = %s, s2 = %s e s3 = %s", s1, s2, s3);

    }
}
