public class Cylinder extends Circle implements Shape3D {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double calculateSA() {
        return 2 * super.calculateArea() + 2 * 3.14159265359 * super.getRadius() * this.height;
    }

}
