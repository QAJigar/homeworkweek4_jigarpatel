package homeworkweek4;

import java.util.Scanner;

/**
 * 6. Write a program in Java to display the pattern like a triangle with a number.
 * For eg.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class Programme_6 {

    public static void main(String[] args) {
        System.out.println("Input number of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
    }
    public static void prime(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);
            System.out.println(" ");
        }
    }
}


