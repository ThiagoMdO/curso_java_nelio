package secao18.model.application;

import secao18.model.entities.AbstractShape;
import secao18.model.entities.Rectangle;

public class Polimorfismo {

    public static void main(String[] args) {
        AbstractShape rec1 = new Rectangle("Blue", 2.0, 2.0);

        System.out.println(rec1);
    }
}
