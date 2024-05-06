package homeworkweek4;

import java.util.Scanner;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class Programme_8 {

    public static void main(String[] args) {
        System.out.printf("Input number of rows : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
prime(n);
sc.close();
    }
    public static void prime(int n) {
        int i, j;
        for (i = 1; i<=n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print("@");
            System.out.println(" ");
        }
    }

}
