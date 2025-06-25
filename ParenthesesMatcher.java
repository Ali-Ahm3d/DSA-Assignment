// Java program to check for matching parentheses using a stack

import java.util.Stack;

public class ParenthesesMatcher {
    // Function to check if parentheses are balanced
    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        // Loop through each character in the string
        for (char ch : str.toCharArray()) {
            // If opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If closing bracket, check for matching opening
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false; // No matching opening
                }
                char open = stack.pop();
                // Check if the popped bracket matches the closing one
                if ((ch == ')' && open != '(') ||
                    (ch == '}' && open != '{') ||
                    (ch == ']' && open != '[')) {
                    return false;
                }
            }
        }
        // If stack is empty, all parentheses matched
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "{[()]}"; // Example input
        if (isBalanced(input)) {
            System.out.println("Parentheses are balanced.");
        } else {
            System.out.println("Parentheses are NOT balanced.");
        }
    }
}