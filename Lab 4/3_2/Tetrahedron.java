
import java.lang.Math;

public class Tetrahedron extends Triangle implements Shape3D {

    public Tetrahedron(double length) {
        super(length, length);
    }

    public double calculateSA() {
        return Math.sqrt(3) * super.calculateArea();
    }

}
