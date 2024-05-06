package homeworkweek4;

import java.util.Scanner;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 * *
 * ***
 * *****
 * *******
 * *********
 * ***********
 * *************
 * ***********
 * *********
 * *******
 * *****
 * ***
 * *
 */
public class Programme_14 {
    public static void main(String[] args) {
        System.out.println("Input number of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
prime(n);
        sc.close();
    }

    public static void prime(int n) {

        int number = 7;
        int m = 1;

        while (m <= number) {
            n = 1;
            while (n++ <= number - m) {
                System.out.print(" ");
            }
            n = 1;
            while (n++ <= m * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            m++;
        }
        m = number - 1;
        while (m > 0) {
            n = 1;
            while (n++ <= number - m) {
                System.out.print(" ");
            }
            n = 1;

            while (n++ <= m * 2 - 1) {
                System.out.print("*");
            }
            System.out.println();
            m--;
        }
    }


}