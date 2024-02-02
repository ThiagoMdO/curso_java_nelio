package exercicios;

public class produtos {
    public static void main(String[] args){
        String product1 = "Computer";
        String product2 = "Desk top";

        Integer age = 30;
        Integer code = 52336;
        Character gender = 'F';

        Double price1 = 2434.324;
        Double price2 = 566D;
        Double measure = 23.44324;

        System.out.println("Products");
        System.out.printf("%s, which price is $ %.2f \n " +
        "%s, which price is $ %.2f \n \n " +
        "Record: %d years old, code %d and gender: %s \n" +
        "Measue with eith decimal places: %.8f \n" +
        "Rouded (three decimal places): %.3f \n" +
        "US decimal point: %.3f",product1, price1, product2, price2, age, code, gender, measure, measure, measure);

    }
}
