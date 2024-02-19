package secao15.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        metodo1();

        System.out.println("Fim do programa");
    }

    public static void metodo1(){
        System.out.println("******** METODO 1 START **********");
        metodo2();

        System.out.println("******** METODO 1 END **********");
    }
    public static void metodo2(){
        System.out.println("******** METODO 2 START **********");
        Scanner scanner = new Scanner(System.in);

        try{
            String[] vectX1 = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vectX1[position]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Não existe essa posição: " + e.getMessage());
            e.printStackTrace();
            scanner.next();
        }catch (InputMismatchException e){
            System.out.println("Apenas numeros: " + e.getMessage());
        }finally {
            if(scanner != null)scanner.close();
        }

        System.out.println("******** METODO 2 END **********");
    }

}
