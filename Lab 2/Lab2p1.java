import java.util.Scanner;
import java.util.Random;

public class Lab2p1 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            choice = sc.nextInt();
            System.out.printf("\n");
            switch (choice) {
                case 1: /* add mulTest() call */
                    mulTest();
                    break;
                case 2: /* add divide() call */
                    System.out.printf("Enter a number, m: ");
                    Scanner mObj = new Scanner(System.in);
                    int m = mObj.nextInt();
                    System.out.printf("Enter a number, n: ");
                    Scanner nObj = new Scanner(System.in);
                    int n = nObj.nextInt();
                    System.out.printf(m + "/" + n + " = " + divide(m, n) + "\n\n");
                    break;
                case 3: /* add modulus() call */
                    System.out.printf("Enter a number, m: ");
                    Scanner pObj = new Scanner(System.in);
                    int p = pObj.nextInt();
                    System.out.printf("Enter a number, n: ");
                    Scanner qObj = new Scanner(System.in);
                    int q = qObj.nextInt();
                    System.out.printf(p + "%%" + q + " = " + modulus(p, q) + "\n\n");
                    break;
                case 4: /* add countDigits() call */
                    System.out.printf("Enter a positive integer: ");
                    Scanner xObj = new Scanner(System.in);
                    int x = xObj.nextInt();
                    if (x < 0) {
                        System.out.printf("Error input!!\n\n");
                    } else {
                        System.out.printf("count = " + countDigits(x) + "\n\n");
                    }
                    break;
                case 5: /* add position() call */
                    System.out.printf("Enter a number: ");
                    Scanner aObj = new Scanner(System.in);
                    int a = aObj.nextInt();
                    System.out.printf("Enter a digit: ");
                    Scanner bObj = new Scanner(System.in);
                    int b = bObj.nextInt();
                    System.out.printf("position = " + position(a, b) + "\n\n");
                    break;
                case 6: /* add extractOddDigits() call */
                    System.out.printf("Enter a number: ");
                    Scanner yObj = new Scanner(System.in);
                    int y = yObj.nextInt();
                    if (y < 0) {
                        System.out.printf("Error input!!\n\n");
                    } else {
                        System.out.printf("OddDigits = " + extractOddDigits(y) + "\n\n");
                    }
                    break;
                case 7:
                    System.out.println("Program terminating ....");
            }
        } while (choice < 7);
    }

    public static void mulTest() {
        int x, y, ans, count = 0;
        for (int i = 0; i < 5; i++) {
            x = new Random().nextInt(9 - 1) + 1;
            y = new Random().nextInt(9 - 1) + 1;
            System.out.printf("How much is " + x + " times " + y + "? ");
            Scanner obj = new Scanner(System.in);
            ans = obj.nextInt();
            if (ans == x * y)
                count++;
        }
        System.out.printf(count + " out of 5 are correct.\n\n");
    }

    public static int divide(int m, int n) {
        int result = 0;
        while (m >= n) {
            m -= n;
            result++;
        }
        return result;
    }

    public static int modulus(int m, int n) {
        while (m >= n)
            m -= n;
        return m;
    }

    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    public static int position(int n, int digit) {
        int count = 2;
        while (n > 0) {
            if (n % 10 == digit)
                return count;
            else
                n /= 10;
        }
        return -1;
    }

    public static long extractOddDigits(long n) {
        int result = 0;
        int ten = 1;
        while (n > 0) {
            if ((n % 10) % 2 != 0) {
                result += (n % 10) * ten;
                ten *= 10;
            }
            n /= 10;
        }
        if (result > 0)
            return result;
        else
            return -1;
    }
}