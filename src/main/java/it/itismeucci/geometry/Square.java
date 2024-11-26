package it.itismeucci.geometry;

public class Square extends Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return Math.pow(this.side, 2);
    }

    @Override
    public double perimeter() {
        return this.side * 4;
    }

    @Override
    public String specString() {
        return "Square with side " + this.side;
    }
}
