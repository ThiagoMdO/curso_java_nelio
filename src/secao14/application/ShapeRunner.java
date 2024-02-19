package secao14.application;

import secao14.entities.Circle;
import secao14.entities.Rectangle;
import secao14.entities.Shape;
import secao14.enums.Color;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ShapeRunner {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Shape> shapeList = new ArrayList<>();

        System.out.print("Enter the numbers of shapes: ");
        int qtdShapes = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= qtdShapes; i++){
            System.out.println("Shape #%d data:");
            System.out.print("Rectangle or Circle (r/c): ");
            char recOrCir = scanner.nextLine().charAt(0);
            if(recOrCir != 'r' && recOrCir != 'c'){
                System.out.print("Rectangle or Circle (r/c): ");
                recOrCir = scanner.nextLine().charAt(0);
            }

            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(scanner.nextLine());

            if(recOrCir == 'r'){
                System.out.print("Width: ");
                Double width = scanner.nextDouble();

                System.out.print("Height: ");
                Double height = scanner.nextDouble();
                scanner.nextLine();

                Shape rec = new Rectangle(color, width, height);

                shapeList.add(rec);
            }
            if(recOrCir == 'c'){
                System.out.print("Radius: ");
                Double radius = scanner.nextDouble();
                scanner.nextLine();

                Shape cir = new Circle(color, radius);

                shapeList.add(cir);
            }



        }
        System.out.println();
        for(Shape obj : shapeList){
            System.out.println(String.format("%.2f",obj.area()));
        }

        scanner.close();
    }
}
