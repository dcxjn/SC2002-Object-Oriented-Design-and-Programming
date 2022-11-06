import java.util.Scanner;

public class P1 {
    public static void main(String args[]) {

        System.out.println("Input A/a/B/b/C/c/D/d: ");
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0);

        if ((choice == 'A') || (choice == 'a'))
            System.out.printf("Action movie fan\n");
        else if ((choice == 'C') || (choice == 'c'))
            System.out.printf("Comedy movie fan\n");
        else if ((choice == 'D') || (choice == 'd'))
            System.out.printf("Drama movie fan\n");
        else
            System.out.printf("Invalid choice\n");
    }
}