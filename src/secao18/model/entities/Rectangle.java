package secao18.model.entities;

public class Rectangle extends AbstractShape{

    private Double with;

    private Double height;

    public Rectangle(String color, Double with, Double height){
        super(color);
        this.with = with;
        this.height = height;
    }

    public Double getWith(){
        return with;
    }

    public void setWith(Double with){
        this.with = with;
    }

    public Double getHeight(){
        return height;
    }

    public void setHeight(Double height){
        this.height = height;
    }

    @Override
    public Double area() {
        return with * height;
    }

    @Override
    public String toString(){
        return super.toString() + ", shape Rectangle, and area: " + area();
    }
}
