package dNine;

public class Triangle extends Figure{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public double area() {
        double halfPerim = perimetr()/2;
        return Math.sqrt(halfPerim*(halfPerim-side1)*(halfPerim-side2)*(halfPerim-side1)*(halfPerim-side3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    @Override
    public double perimetr() {
        return this.side1 + this.side2 + this.side3;
    }
}
