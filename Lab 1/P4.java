import java.util.Scanner;

public class P4 {
    public static void main(String args[]) {

        System.out.printf("height: ");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        if (height <= 0)
            System.out.println("Error input!!");
        else {
            String s = "\0";
            for (int i = 0; i < height; i++) {
                if (i % 2 == 0) {
                    s = "AA" + s;
                    System.out.println(s);
                } else {
                    s = "BB" + s;
                    System.out.println(s);
                }
            }
        }
    }
}

// else {
// for (int i = 0; i < height; i++) {
// if (i % 2 == 0) {
// for (int j = 0; j <= i; j++) {
// if (j % 2 == 0)
// System.out.printf("AA");
// else
// System.out.printf("BB");
// }
// System.out.printf("\n");
// } else {
// for (int j = 0; j <= i; j++) {
// if (j % 2 == 0)
// System.out.printf("BB");
// else
// System.out.printf("AA");
// }
// System.out.printf("\n");
// }
// }
// }
