/**
 * MAIN CLASS - PalindromeCheckerApp
 * This class serves as the container for the entire Palindrome Checker System.
 */
public class PalindromeCheckerApp {

    /**
     * Entry point of the Java application.
     * The JVM invokes this method to start the program.
     */
    public static void main(String[] args) {
        // Step 1: Display Welcome Message and App Details
        displayWelcomeMessage();

        // Step 2: Define flow control (Prepare for next UC)
        System.out.println("System initialized. Ready for processing...");
    }

    /**
     * UC1: Displays the application name and version.
     * This uses the static keyword so it can be called from main().
     */
    public static void displayWelcomeMessage() {
        System.out.println("========================================");
        System.out.println("   WELCOME TO PALINDROME CHECKER PRO    ");
        System.out.println("========================================");
        System.out.println("Application Version: 1.0");
        System.out.println("Status: Startup Flow Established");
        System.out.println("----------------------------------------");
    }
}