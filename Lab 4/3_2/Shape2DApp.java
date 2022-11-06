import java.util.Scanner;

public class Shape2DApp {

    public static void main(String[] args) {

        int num;
        System.out.println("Enter no. of shapes: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        int count = 1;

        double total = 0;

        do {
            System.out.println("\nChoose shape " + count + ":");
            System.out.println("(1) Circle");
            System.out.println("(2) Triangle");
            System.out.println("(3) Rectangle");

            sc = new Scanner(System.in);
            int choice = sc.nextInt();

            count++;

            switch (choice) {

                case 1:
                    System.out.println("\nEnter radius: ");
                    sc = new Scanner(System.in);
                    double rad = sc.nextDouble();
                    Circle circ = new Circle(rad);
                    System.out.println("Area: " + circ.calculateArea());
                    total += circ.calculateArea();
                    break;

                case 2:
                    System.out.println("\nEnter height: ");
                    sc = new Scanner(System.in);
                    double height = sc.nextDouble();
                    System.out.println("Enter base: ");
                    sc = new Scanner(System.in);
                    double base = sc.nextDouble();
                    Triangle tri = new Triangle(height, base);
                    System.out.println("Area: " + tri.calculateArea());
                    total += tri.calculateArea();
                    break;

                case 3:
                    System.out.println("\nEnter length: ");
                    sc = new Scanner(System.in);
                    double length = sc.nextDouble();
                    System.out.println("Enter breadth: ");
                    sc = new Scanner(System.in);
                    double breadth = sc.nextDouble();
                    Rectangle rect = new Rectangle(length, breadth);
                    System.out.println("Area: " + rect.calculateArea());
                    total += rect.calculateArea();
                    break;
            }
        } while (count <= num);

        System.out.println("Total area: " + total);

    }

}
