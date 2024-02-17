package secao14.entities;

import secao14.enums.Color;

public class Circle extends Shape{

    private Double radius;

    public Circle(){
        super();
    }

    public Circle(Color color, Double radius){
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area(){
        return radius * radius * Math.PI;
    }
}
