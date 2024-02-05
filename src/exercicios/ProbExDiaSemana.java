package exercicios;

import java.util.Scanner;

public class ProbExDiaSemana {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int dayOfWeek = scanner.nextInt();
        String dayString;
        switch(dayOfWeek){
            case 1:
                dayString = "Domingo";
                break;
            case 2:
                dayString = "Segunda";
                break;
            case 3:
                dayString = "Terça";
                break;
            case 4:
                dayString = "Quarta";
                break;
            case 5:
                dayString = "Quinta";
                break;
            case 6:
                dayString = "Sexta";
                break;
            case 7:
                dayString = "Sábado";
                break;
            default:
                dayString = "";
        }
        if(dayOfWeek >= 0 && dayOfWeek <= 7){
            System.out.printf("O dia da semana selecionado foi %s", dayString);
        }else{
            System.out.println("Selecione um dia valido");
        }
    }
}
