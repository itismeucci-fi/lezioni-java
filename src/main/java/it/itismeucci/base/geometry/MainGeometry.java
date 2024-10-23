package it.edu.itismeucci.geometry;

public class MainGeometry {



    public static void main(String[] args) {
        Object s = new Square(2);

        Shape s1 = (Shape)s; 

        s1.printInfo();

        Shape c = new Circle(2);
        c.printInfo();

    }

}
