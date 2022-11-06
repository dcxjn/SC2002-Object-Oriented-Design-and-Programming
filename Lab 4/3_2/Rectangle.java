
public class Rectangle {

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength() {
        return this.length;
    }

    public double getBreadth() {
        return this.breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }

}
