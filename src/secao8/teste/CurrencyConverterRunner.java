package secao8.teste;

import secao8.util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterRunner {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double priceCurrency = scanner.nextDouble();

        System.out.print("How many dollars will be bought: ");
        double boughCurrency = scanner.nextDouble();

        double valorTotal = CurrencyConverter.convert(priceCurrency, boughCurrency);
        System.out.printf("Amount to be paid in reais: %.2f",valorTotal);

        scanner.close();

    }
}
