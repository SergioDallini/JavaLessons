package dNine;

public class Circle extends Figure{
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * this.radius*this.radius;
    }

    @Override
    public double perimetr() {
        return 2*this.radius*Math.PI;
    }

    @Override
    public String toString() {
             return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
