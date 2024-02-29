package secao19.application;

import secao19.model.entities.Circle;
import secao19.model.entities.Rectangle;
import secao19.model.entities.Shape;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ShapRunner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Shape> myShapes = new ArrayList<>();

        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total area: " + totalArea(myShapes));
        System.out.println("Total area: " + totalArea(myCircles));

        LocalDate data = LocalDate.parse("2012-03-22");

        System.out.println(data);

        if(data instanceof Object){
            System.out.println("é");
        }

        String str = "Hello";
        Integer num = 69609650;

        System.out.println("HashCode de str: " + str.hashCode());
        System.out.println("HashCode de num: " + num.hashCode());
    }

    public static double totalArea(List<? extends Shape> list){

        double sum = 0.0;
        for (Shape s : list){
            sum += s.area();
        }
//        LocalDateTime;
        return sum;
    }
}
