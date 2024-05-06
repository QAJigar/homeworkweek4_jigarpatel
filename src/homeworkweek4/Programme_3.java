package homeworkweek4;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class Programme_3 {

    public static void main(String[] args) {
        System.out.print("Input an alphabet : ");
        Scanner obj = new Scanner(System.in);
        String input = obj.next().toLowerCase();
        prime(input);
        obj.close();
    }

    public static void prime(String input) {
        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");
        if (input.length() > 1) {
            System.out.println("Error.Not a single character. ");
            System.out.println("Error.Not a letter.Enter uppercase or lowercase letter. ");
        } else if (!(uppercase || lowercase)) {
        } else if (vowels) {
            System.out.println("Input letter is Vowel. ");
        } else {
            System.out.println("Input letter is Consonant. ");
        }
    }

}
