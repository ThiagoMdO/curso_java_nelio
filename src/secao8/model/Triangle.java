package secao8.model;

public class Triangle {

    public double a;
    public double b;
    public double c;

    public double calcularAreaTriangulo() {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

//    Triangle(){
//
//    }
//    Triangle(double a, double b, double c){
//
//    }
}
