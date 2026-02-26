import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        displayWelcomeMessage(); // UC1

        String target = "madam";

        // Previous UC calls
        checkByReversal(target);   // UC3
        checkByTwoPointer(target); // UC4
        checkByStack(target);      // UC5

        // UC6: Stack vs Queue Implementation
        System.out.println("\n--- UC6: Stack (LIFO) vs Queue (FIFO) ---");
        checkByStackAndQueue(target);
    }

    // ... Keep previous UC methods here ...

    /**
     * UC6: Demonstrates FIFO vs LIFO.
     * Key Concepts: Queue (FIFO), Stack (LIFO), Enqueue/Dequeue.
     */
    public static void checkByStackAndQueue(String original) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>(); // Queue is an interface in Java

        // Step 1: Populate both structures
        for (char c : original.toCharArray()) {
            stack.push(c);   // LIFO: Last character will be on top
            queue.add(c);    // FIFO: First character remains at the front
        }

        boolean isPalindrome = true;

        // Step 2: Compare Dequeue (FIFO) vs Pop (LIFO)
        while (!stack.isEmpty()) {
            char fromStack = stack.pop();    // Returns characters in REVERSE
            char fromQueue = queue.remove(); // Returns characters in ORIGINAL order

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("UC6: Match! Queue and Stack comparison confirms Palindrome.");
        } else {
            System.out.println("UC6: Mismatch! Not a Palindrome.");
        }
    }
}