package Ex_12_OOPs.Lab099_Enums;

public class AdvancedEnum {
    public static void main() {
        Planet P = Planet.EARTH;
        System.out.println(P.getMass());
        System.out.println(P.getRadius());
        System.out.println(P.surfaceGravity());
        System.out.println(Planet.MARS.getRadius());
    }
}

enum Planet {
    MERCURY(3.303e23, 2.4397e6),
    VENUS(4.869e24, 6.0518e6),
    EARTH(5.976e24, 6.37814e6),
    MARS(6.421e23, 3.3972e6);

    private final double mass;
    private final double radius;

    Planet (double mass, double radius){
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass(){
        return mass;
    }

    public double getRadius(){
        return radius;
    }

    public double surfaceGravity(){
        final double G = 6.67300E-11;
        return G * mass / (radius * radius);
    }
}
