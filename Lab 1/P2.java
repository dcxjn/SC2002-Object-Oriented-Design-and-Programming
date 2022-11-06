import java.util.Scanner;

public class P2 {
    public static void main(String args[]) {

        System.out.printf("salary: ");
        Scanner salaryObj = new Scanner(System.in);
        String salaryString = salaryObj.nextLine();
        int salary = Integer.parseInt(salaryString.substring(1));

        System.out.printf("merit: ");
        Scanner meritObj = new Scanner(System.in);
        int merit = meritObj.nextInt();

        char grade = '\0';

        if (salary >= 500 && salary <= 649) {
            grade = 'C';
        } else if (salary >= 600 && salary <= 799) {
            if (merit < 10)
                grade = 'C';
            else
                grade = 'B';
        } else if (salary >= 700 && salary <= 899) {
            if (merit < 20)
                grade = 'B';
            else
                grade = 'A';
        }

        System.out.println("Grade " + grade);
    }
}
