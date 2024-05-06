package homeworkweek4;

import java.util.Scanner;

/**
 * 15. Display left angle triangle of * using nested for loops
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */
public class Programme_15 {

    public static void starLeftTringle( int k){

        int a;
        int b;
        for (a=0; a<k; a++){
            for (b=2 * (k-a); b>=0; b--){
                System.out.print(" ");
            }
            for (b=0; b<=a; b++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int k = 5;
        Scanner sc = new Scanner(System.in);
        starLeftTringle(k);
        sc.close();
    }
}
