package Project;

import java.util.Scanner;

public class ayan {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");

        // Read the input character
        char inputChar = scanner.next().charAt(0);

        // Close the scanner
        scanner.close();

        // Check if the character is an uppercase alphabet (A-Z)
        if (Character.isUpperCase(inputChar)) {
            System.out.println(1);
        }
        // Check if the character is a lowercase alphabet (a-z)
        else if (Character.isLowerCase(inputChar)) {
            System.out.println(0);
        }
        // If the character is not an alphabet
        else {
            System.out.println(-1);
        }
    }
}

