package it.edu.itismeucci.geometry;

public abstract class Shape {

    public abstract double area();

    public abstract double perimeter();

    public abstract String specString();

    public void printInfo() {
        System.out.println("----------------------------------------");
        System.out.println(this.specString());
        System.out.println("L'area vale: " + this.area());
        System.out.println("Il perimetro vale: " + this.perimeter());
        System.out.println("----------------------------------------");
    }

}
