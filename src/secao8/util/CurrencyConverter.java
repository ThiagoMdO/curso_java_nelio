package secao8.util;

public class CurrencyConverter {

    public static double convert(double currencyPrice, double currencyQuantity){

        double totalMoney = currencyPrice * currencyQuantity;

        return totalMoney += totalMoney*06/100;

    }
}
