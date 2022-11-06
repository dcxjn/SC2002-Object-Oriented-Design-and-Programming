
import java.lang.Math;

public class Sphere extends Circle implements Shape3D {

    public Sphere(double radius) {
        super(radius);
    }

    public double calculateSA() {
        return 4 * 3.14159265359 * Math.pow(super.getRadius(), 2);
    }

}
