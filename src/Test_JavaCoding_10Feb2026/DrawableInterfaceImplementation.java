package Test_JavaCoding_10Feb2026;

public class DrawableInterfaceImplementation {
    public static void main() {
        Circle1 d1 = new Circle1();
        d1.draw();
        Rectangle1 d2 = new Rectangle1();
        d2.draw();
    }
}

interface Drawable {
    void draw();
}

class Circle1 implements Drawable {

    @Override
    public void draw() {
        System.out.print("Drawing a Circle ");
    }
}

class Rectangle1 implements Drawable {

    @Override
    public void draw() {
        System.out.print("Drawing a Rectangle ");
    }
}
