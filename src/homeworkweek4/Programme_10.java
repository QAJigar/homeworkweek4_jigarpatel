package homeworkweek4;

import java.util.Scanner;
/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class Programme_10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = scn.nextInt();
        checkArmsstrongNum(num);
        scn.close();

    }
    public static void checkArmsstrongNum(int n) {
        int number;
        int temp,total = 0;

        number = n;
        while(number !=0){
            temp = number% 10;
            total = total + temp * temp * temp;
            number /= 10;

        }
        if (total ==n){
            System.out.println(n + " is not Armstrong number");

        }
    }
}
