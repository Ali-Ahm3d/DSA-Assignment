// Java program to calculate the sum of all elements in an integer array using recursion

public class RecursiveArraySum {
    // Recursive function to calculate sum
    public static int recursiveSum(int[] arr, int n) {
        // Base case: if array is empty
        if (n <= 0) {
            return 0;
        }
        // Recursive case: sum of last element and sum of the rest
        return recursiveSum(arr, n - 1) + arr[n - 1];
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10}; // Example array
        int sum = recursiveSum(arr, arr.length);
        System.out.println("Sum of array elements: " + sum);
    }
}