package secao10.aplication;

import secao10.model.EstudantesAluguel;
import secao10.model.QuartosAluguel;

import java.util.Scanner;

public class AluguelQuartoRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int qtdAlugar = scanner.nextInt();

        int qtdQuartosDisponiveis = 9;

        QuartosAluguel[] quartosAluguel = new QuartosAluguel[qtdQuartosDisponiveis];
        EstudantesAluguel[] estudantesAluguels = new EstudantesAluguel[qtdAlugar];

        for (int i = 0; i < qtdAlugar; i++) {
            System.out.printf("Rent #%d\n", i + 1);
            scanner.nextLine();
            System.out.print("Name: ");
            String nome = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();
            estudantesAluguels[i] = new EstudantesAluguel(nome, email);

            System.out.print("Room: ");
            int room = scanner.nextInt();

            quartosAluguel[room] = new QuartosAluguel(estudantesAluguels[i], room);
        }

        System.out.println();

        for (int i = 0; i < qtdQuartosDisponiveis; i++){
            if(quartosAluguel[i] != null){
                System.out.println(quartosAluguel[i]);
            }
        }
    }
}
