package secao18.model.entities;

import secao16_jogoXadrez.chess.Color;
import secao18.model.services.Shape;

public abstract class AbstractShape implements Shape {

    private String color;

    public AbstractShape(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }


    @Override
    public String toString(){
        return "Color: " + color;
    }
}
