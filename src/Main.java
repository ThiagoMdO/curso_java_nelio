import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        String nome = "Maria";

        int idade = 12;

        double renda = 4000.23;

        System.out.printf("%s tem %d anos e ganha $ %.2f %n", nome, idade, renda);

        Locale.setDefault(Locale.US);
        double x = 10.479445;
        System.out.println(x);
        System.out.printf("%.2f%n",x);
        System.out.printf("%.4f\n",x);
        System.out.printf("%.3f",x);

        System.out.println("Hello world!");

        System.out.println("o valor x = "+x+" então");

        System.out.printf("Resultado = %.2f metros%n", x);


    }
}
