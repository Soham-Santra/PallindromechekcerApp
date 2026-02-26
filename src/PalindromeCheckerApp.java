import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        displayWelcomeMessage(); // From UC1

        String target = "madam";

        // Previous Use Cases
        checkByReversal(target);   // UC3
        checkByTwoPointer(target); // UC4

        // UC5: Stack Implementation
        System.out.println("\n--- UC5: Stack Result ---");
        checkByStack(target);
    }

    // ... Keep previous UC methods here ...

    /**
     * UC5: Uses a Stack data structure to reverse and validate.
     * Key Concepts: Stack, Push (LIFO), Pop.
     */
    public static void checkByStack(String original) {
        // Step 1: Push all characters onto the stack
        Stack<Character> stack = new Stack<>();
        for (char c : original.toCharArray()) {
            stack.push(c);
        }

        // Step 2: Pop characters to rebuild the string in reverse order
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Step 3: Compare results
        if (original.equals(reversed)) {
            System.out.println("UC5: '" + original + "' is a palindrome using Stack.");
        } else {
            System.out.println("UC5: '" + original + "' is NOT a palindrome.");
        }
    }
}