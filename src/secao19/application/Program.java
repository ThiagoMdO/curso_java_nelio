package secao19.application;

import secao19.model.services.PrintService;
import secao19.model.services.PrintServiceGenerics;
import secao19.model.services.PrintServiceObject;
import secao19.model.services.PrintServiceString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many values? ");
        int qtdNumbers = scanner.nextInt();

//        PrintService printService = new PrintService();
//        PrintServiceString printService = new PrintServiceString();
        //Daria para armazenar mais de um tipo de dado em um array com a class Object, porem ela não garante o Type Safety e melhor performace
        //Type Safety garante que um array será apenas de um tipo,
            // ex: caso uma variavel de qualquer tipo tente pegar um valor valor de um array Object podera fazer um downCasting para poder armazenar o dado,
                // e caso tente recuperar, como exemplo, um int numa posicao que é String vai estourar um erro de ClassCastingException
        //Performace - Não é necessario ficar toda hora fazendo downCasting ou UpCasting para armazenar dados
//        PrintServiceObject printService = new PrintServiceObject();

        //Usando a classe generica
        PrintServiceGenerics<Integer> printService = new PrintServiceGenerics();
        for (int i = 1; i <= qtdNumbers; i++) {
            System.out.printf("number #%d: ", i);
            printService.addValue(scanner.nextInt());
        }

        printService.print();
        System.out.println("First: " + printService.first());




//        String[] lista2 = new String[3];
//        lista2[0] = "aQUI_e_BAD";
//        lista2[1] = "bad_bad_bad";
//        lista2[2] = "bad_bad_bad";
//
//        int n = 3;
//        String s = "bad";
//
//        int n2 = solucao(n, s, lista2);
//
//        System.out.println("vezes que a palavra " + s + " aparece : " + n2 + " vezes");
    }

    public static int solucao(int n, String s, String[] list2) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            if (list2[i].toLowerCase().contains(s)) {
                result++;
            }
        }
        return result;
    }
}
