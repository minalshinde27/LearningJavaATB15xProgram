package Test_JavaCoding_10Feb2026;

public class AbstractShapeImplementation {
    public static void main() {
        Shape s1 = new Rectangle(5, 3);
        System.out.print("Rectangle Area: "+s1.getArea());
        Shape s2 = new Circle(4);
        System.out.print("Circle Area: "+s2.getArea());
    }
}

abstract class Shape {
    double shapeArea;
    abstract double getArea();
}

class Rectangle extends Shape {
    int length;
    int width;
    @Override
    double getArea() {
        this.shapeArea = this.length*this.width;
        return shapeArea;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
}

class Circle extends  Shape {
    int radius;

    @Override
    double getArea() {
        this.shapeArea = Math.PI * this.radius * this.radius;
        return this.shapeArea;
    }

    public Circle(int radius) {
        this.radius = radius;
    }
}