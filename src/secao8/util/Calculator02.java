package secao8.util;

public class Calculator02 {

    //coloca final para dizer que não vai mudar o valor - constante
    //Constantes são delaradas tudo maiusculas e separadas com underline, ex: NET_SALARY
    public final double PI = 3.14159;

    public double circumference(double radius){
        return 2.0 * PI * radius;
    }

    public double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

}
