// Java program to reverse an array using a stack

import java.util.Stack;

public class ReverseArrayWithStack {
    public static void main(String[] args) {
        // Example array to reverse
        int[] arr = {1, 2, 3, 4, 5};

        // Create a stack to hold array elements
        Stack<Integer> stack = new Stack<>();

        // Push all elements of the array onto the stack
        for (int num : arr) {
            stack.push(num);
        }

        // Pop elements from the stack and put them back into the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }

        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}