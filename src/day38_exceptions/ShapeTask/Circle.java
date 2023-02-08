package day38_exceptions.ShapeTask;

public class Circle {
    private double Radius;
    public Circle(double radius){
        setRadius(radius);
    }

    public double getRadius() {
        return Radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new InvalidShapeException("Invalid radius "+radius);
        }
        Radius = radius;
    }
}
