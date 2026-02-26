/**
 * MAIN CLASS - PalindromeCheckerApp
 * Consolidating UC1 and UC2.
 */
public class PallindromecheckerApp {

    public static void main(String[] args) {
        // UC1: Startup Flow
        displayWelcomeMessage();

        // UC2: Hardcoded Validation
        // We define a String Literal "madam" stored in the String Constant Pool
        String target = "madam";
        checkHardcoded(target);
    }

    // UC1: Welcome Message
    public static void displayWelcomeMessage() {
        System.out.println("========================================");
        System.out.println("   WELCOME TO PALINDROME CHECKER PRO    ");
        System.out.println("========================================");
        System.out.println("Version: 2.0");
        System.out.println("----------------------------------------");
    }

    /**
     * UC2: Demonstrates basic palindrome validation.
     * Uses a hardcoded string and conditional logic.
     */
    public static void checkHardcoded(String original) {
        // For UC2, we focus on the structure of the IF-ELSE statement
        // Since we haven't implemented reversal logic yet, we simulate a check.
        System.out.println("Checking hardcoded string: " + original);

        // Conditional Statement (if-else)
        if (original.equals("madam")) {
            System.out.println("Result: The string is a palindrome.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }
}