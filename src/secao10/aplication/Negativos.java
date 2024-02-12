package secao10.aplication;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int quantidadeNumeros = scanner.nextInt();

        double[] nums = new double[quantidadeNumeros];

        for (int i = 0; i < nums.length; i++) {
            System.out.print("Digite um número: ");
            nums[i] = scanner.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS");
        for (int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                System.out.println(nums[i]);
            }
        }

        scanner.close();
    }
}
