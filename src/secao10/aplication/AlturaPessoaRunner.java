package secao10.aplication;

import secao10.model.AlturaPessoaClass;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class AlturaPessoaRunner {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int qtdPessoas = scanner.nextInt();

        String[] qtsNomes = new String[qtdPessoas];
        int[] qtdIdades = new int[qtdPessoas];
        double[] qtdAltura = new double[qtdPessoas];
        for (int i = 0; i < qtdPessoas; i++) {
            System.out.printf("Dados da %da pessoa: \n", i + 1);
            scanner.nextLine();
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            qtsNomes[i] = nome;

            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            qtdIdades[i] = idade;

            System.out.print("Altura: ");
            double altura = scanner.nextDouble();
            qtdAltura[i] = altura;

        }

        AlturaPessoaClass alturaPessoaClass = new AlturaPessoaClass(qtsNomes, qtdIdades, qtdAltura);

        double somaAltura = 0;
        double mediaAltura;
        int pessoasMenores16 = 0;
        for (int i = 0; i < alturaPessoaClass.getAltura().length; i++){
            somaAltura += alturaPessoaClass.getAlturaForIndex(i);
            if(alturaPessoaClass.getIdadeForIndex(i) < 16){
                pessoasMenores16 ++;
            }
        }
        mediaAltura = somaAltura / alturaPessoaClass.getAltura().length;
        pessoasMenores16 *= 100 / alturaPessoaClass.getIdade().length;

        System.out.printf("Altura média: %.2f \n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %d%% \n", pessoasMenores16);
        for(int i = 0; i < alturaPessoaClass.getNome().length; i++){
            if(alturaPessoaClass.getIdadeForIndex(i) < 16){
                System.out.println(alturaPessoaClass.getNomeForIndex(i));
            }
        }

        scanner.close();
    }

}
