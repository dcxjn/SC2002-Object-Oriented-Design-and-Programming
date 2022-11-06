import java.lang.Math;

public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double calculateArea() {
        return 3.14159265359 * Math.pow(this.radius, 2);
    }

}
