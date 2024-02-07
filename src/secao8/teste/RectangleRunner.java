package secao8.teste;

import secao8.model.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class RectangleRunner {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        System.out.print("Width: ");
        rectangle.width = scanner.nextDouble();

        System.out.print("Height: ");
        rectangle.height = scanner.nextDouble();

        System.out.println(rectangle);
    }
}
