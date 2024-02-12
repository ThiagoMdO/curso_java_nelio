package secao10.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos serão digitados? ");
        int qtdNumerosAlunos = scanner.nextInt();

        String[] nomes = new String[qtdNumerosAlunos];
        double[] notaPrimeiroSemestre = new double[qtdNumerosAlunos];
        double[] notaSegundoSemestre = new double[qtdNumerosAlunos];

        double notaMediaAluno = 0;

        for (int i = 0; i < qtdNumerosAlunos; i++) {
            System.out.printf("Digite nome, primeira e segunda nota do %do aluno: \n", i + 1);
            scanner.nextLine();
            nomes[i] = scanner.nextLine();
            notaPrimeiroSemestre[i] = scanner.nextDouble();
            notaSegundoSemestre[i] = scanner.nextDouble();
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < nomes.length; i++) {
            notaMediaAluno = (notaPrimeiroSemestre[i] + notaPrimeiroSemestre[i])/2;
            if(notaMediaAluno >= 6){
                System.out.println(nomes[i]);
            }
        }

        scanner.close();
    }
}
