import java.util.Scanner;

public class Shape3DApp {

    public static void main(String[] args) {

        int num;
        System.out.println("Enter no. of shapes: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        int count = 1;

        double total = 0;

        do {
            System.out.println("\nChoose shape " + count + ":");
            System.out.println("(1) Sphere");
            System.out.println("(2) Regular Tetrahedron");
            System.out.println("(3) Cube");
            System.out.println("(4) Cone");
            System.out.println("(5) Cylinder");

            sc = new Scanner(System.in);
            int choice = sc.nextInt();

            count++;

            switch (choice) {

                case 1:
                    System.out.println("\nEnter radius: ");
                    sc = new Scanner(System.in);
                    double rad = sc.nextDouble();
                    Sphere sph = new Sphere(rad);
                    System.out.println("Area: " + sph.calculateSA());
                    total += sph.calculateSA();
                    break;

                case 2:
                    System.out.println("\nEnter length: ");
                    sc = new Scanner(System.in);
                    double length = sc.nextDouble();
                    Tetrahedron tetra = new Tetrahedron(length);
                    System.out.println("Area: " + tetra.calculateSA());
                    total += tetra.calculateSA();
                    break;

                case 3:
                    System.out.println("\nEnter length: ");
                    sc = new Scanner(System.in);
                    double length2 = sc.nextDouble();
                    Cube cube = new Cube(length2);
                    System.out.println("Area: " + cube.calculateSA());
                    total += cube.calculateSA();
                    break;

                case 4:
                    System.out.println("\nEnter radius: ");
                    sc = new Scanner(System.in);
                    double rad2 = sc.nextDouble();
                    System.out.println("Enter length: ");
                    sc = new Scanner(System.in);
                    double length3 = sc.nextDouble();
                    Cone cone = new Cone(rad2, length3);
                    System.out.println("Area: " + cone.calculateSA());
                    total += cone.calculateSA();
                    break;

                case 5:
                    System.out.println("\nEnter radius: ");
                    sc = new Scanner(System.in);
                    double rad3 = sc.nextDouble();
                    System.out.println("Enter height: ");
                    sc = new Scanner(System.in);
                    double height = sc.nextDouble();
                    Cylinder cyl = new Cylinder(rad3, height);
                    System.out.println("Area: " + cyl.calculateSA());
                    total += cyl.calculateSA();
                    break;

            }
        } while (count <= num);

        System.out.println("Total area: " + total);

    }

}
