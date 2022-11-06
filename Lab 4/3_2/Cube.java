public class Cube extends Rectangle implements Shape3D {

    public Cube(double length) {
        super(length, length);
    }

    public double calculateSA() {
        return 6 * super.calculateArea();
    }

}
