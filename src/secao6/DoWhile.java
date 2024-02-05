package secao6;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        String continua;
        do{
            System.out.println("Digite a temperatura em Celsius: ");
            double C = scanner.nextDouble();
            double F = 9*C/5+32;
            System.out.println(F);

            System.out.println("Deseja continuar, sim ou nao?");
            continua = scanner.next().toLowerCase();

        }while (continua.equals("sim"));
    }

}
