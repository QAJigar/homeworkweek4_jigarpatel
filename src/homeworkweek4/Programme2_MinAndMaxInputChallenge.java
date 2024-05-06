package homeworkweek4;

import java.util.Scanner;

/**
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class Programme2_MinAndMaxInputChallenge {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Type a number (or -1 to stop); ");
        int number = scn.nextInt();
        int max = number;
        int min = number;
        while (number != -1) {
            if (number > max) {
                max=number;
            }else if (number < min){
                min=number;
            }
            System.out.println("Type a number (or -1 to stop): ");
            number=scn.nextInt();
        }
        if (max != -1 && min != -1) {
            System.out.println("Maximum was " + max);
            System.out.println("Minimum was " + min);
            scn.close();
        }
    }
}
