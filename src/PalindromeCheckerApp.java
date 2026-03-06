import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // UC 1: Welcome Message
        displayWelcomeMessage();

        String target = "madam";

        // Calling all implemented Use Cases
        checkByReversal(target);      // UC 3
        checkByTwoPointer(target);    // UC 4 (Restored)
        checkByStack(target);         // UC 5 (Restored)
        checkByStackAndQueue(target); // UC 6
        checkByDeque(target);         // UC 7

        System.out.println("\n--- UC 8: Linked List (Double-Ended) Result ---");
        checkByLinkedList(target);    // UC 8 (New)
    }

    // UC 1: Welcome Message
    public static void displayWelcomeMessage() {
        System.out.println("========================================");
        System.out.println("   WELCOME TO PALINDROME CHECKER    ");
        System.out.println("========================================");
    }

    // UC 3: Reversal Logic
    public static void checkByReversal(String original) {
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        System.out.println("UC 3 (Reversal): " + original.equals(reverse));
    }

    // UC 4: Two-Pointer Logic
    public static void checkByTwoPointer(String original) {
        char[] chars = original.toCharArray();
        int left = 0, right = chars.length - 1;
        boolean isPal = true;
        while (left < right) {
            if (chars[left++] != chars[right--]) {
                isPal = false;
                break;
            }
        }
        System.out.println("UC 4 (Two-Pointer): " + isPal);
    }

    // UC 5: Stack Logic
    public static void checkByStack(String original) {
        Stack<Character> stack = new Stack<>();
        for (char c : original.toCharArray()) stack.push(c);
        String rev = "";
        while (!stack.isEmpty()) rev += stack.pop();
        System.out.println("UC 5 (Stack): " + original.equals(rev));
    }

    // UC 6: Stack vs Queue
    public static void checkByStackAndQueue(String original) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();
        for (char c : original.toCharArray()) {
            stack.push(c);
            queue.add(c);
        }
        boolean match = true;
        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.remove())) {
                match = false;
                break;
            }
        }
        System.out.println("UC 6 (Stack vs Queue): " + match);
    }

    // UC 7: Deque Logic
    public static void checkByDeque(String original) {
        Deque<Character> deque = new LinkedList<>();
        for (char c : original.toCharArray()) {
            deque.addLast(c);
        }
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("UC 7 (Deque): " + isPalindrome);
    }


    public static void checkByLinkedList(String original) {
        LinkedList<Character> list = new LinkedList<>();
        for (char c : original.toCharArray()) {
            list.add(c);
        }
        boolean isPalindrome = true;
        while (list.size() > 1) {
            // Symmetrically remove from head and tail
            if (!list.removeFirst().equals(list.removeLast())) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("UC 8 (Linked List): " + isPalindrome);
    }
}