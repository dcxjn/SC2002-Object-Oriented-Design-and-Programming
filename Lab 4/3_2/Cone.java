public class Cone extends Circle implements Shape3D {

    private double length;

    public Cone(double radius, double length) {
        super(radius);
        this.length = length;
    }

    public double calculateSA() {
        return super.calculateArea() + 3.14159265359 * super.getRadius() * this.length;
    }

}
