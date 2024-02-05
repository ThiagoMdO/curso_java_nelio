package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExemplo {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Double QtdMinutos = scanner.nextDouble();

        if(QtdMinutos < 100){
            System.out.println("Valor a pagar: R$50");
        }else{
            QtdMinutos = (QtdMinutos - 100) *2;
//            QtdMinutos *= 2;
            System.out.printf("Valor a pagar: R$%.2f\n", (50+QtdMinutos));
        }
    }
}
