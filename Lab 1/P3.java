import java.util.Scanner;

public class P3 {
    public static void main(String args[]) {

        System.out.printf("starting: ");
        Scanner startingObj = new Scanner(System.in);
        int starting = startingObj.nextInt();

        System.out.printf("ending: ");
        Scanner endingObj = new Scanner(System.in);
        int ending = endingObj.nextInt();

        System.out.printf("increment: ");
        Scanner incrementObj = new Scanner(System.in);
        int increment = incrementObj.nextInt();

        if (starting > ending || increment > ending)
            System.out.println("Error input!!");
        else {

            // Table 1 (for loop)
            // System.out.println("Table 1");
            System.out.println("US$         S$");
            System.out.println("--------------");
            for (int i = starting; i <= ending; i += increment) {
                if (i < 10)
                    System.out.println(i + "           " + i * 1.82);
                else
                    System.out.println(i + "          " + i * 1.82);
            }

            // Table 2 (while loop)
            // System.out.println("Table 2");
            System.out.println("US$         S$");
            System.out.println("--------------");
            int j = starting;
            while (j <= ending) {
                if (j < 10)
                    System.out.println(j + "           " + j * 1.82);
                else
                    System.out.println(j + "          " + j * 1.82);
                j += increment;
            }

            // Table 3 (do/while loop)
            // System.out.println("Table 3");
            System.out.println("US$         S$");
            System.out.println("--------------");
            int k = starting;
            do {
                if (k < 10)
                    System.out.println(k + "           " + k * 1.82);
                else
                    System.out.println(k + "          " + k * 1.82);
                k += increment;
            } while (k <= ending);
        }
    }
}
