import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC1: Startup
        displayWelcomeMessage();

        // UC2: Setup target string
        String target = "madam";

        // UC3: Logic execution
        checkByReversal(target);
    }

    public static void displayWelcomeMessage() {
        System.out.println("=== Palindrome Checker Pro ===");
        System.out.println("Version: 3.0");
        System.out.println("------------------------------");
    }

    /**
     * UC3: Reverses string using a loop and compares.
     * Key Concepts: for-loop, String Immutability, equals().
     */
    public static void checkByReversal(String original) {
        String reverse = ""; // Empty string to hold reversed text

        // Loop backwards through the string
        for (int i = original.length() - 1; i >= 0; i--) {
            // String Concatenation: creates a new object each time
            reverse = reverse + original.charAt(i);
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reverse);

        // compare content using .equals()
        if (original.equals(reverse)) {
            System.out.println("UC3 Result: It IS a palindrome.");
        } else {
            System.out.println("UC3 Result: It is NOT a palindrome.");
        }
    }
}