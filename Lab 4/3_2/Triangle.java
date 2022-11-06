
public class Triangle implements Shape {

    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return this.height;
    }

    public double getBase() {
        return this.base;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }

}
