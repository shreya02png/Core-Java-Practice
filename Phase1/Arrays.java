/**
Arrays (1D and 2D)
 * An array stores multiple values of the SAME type in a single variable.
 * Array size is FIXED once declared — cannot grow or shrink.
 * Index starts from 0.

 * Types:
 *   1. One-dimensional (1D) array
 *   2. Two-dimensional (2D) array
 * Important operations:
 *   - Traverse, find max/min, reverse, sort, linear search
 */
public class Arrays {

    public static void main(String[] args) {

        //declare and initialize an array
        // Method 1: declare size,then assign values
        int[] marks = new int[5];
        marks[0] = 85;
        marks[1] = 90;
        marks[2] = 78;
        marks[3] = 92;
        marks[4] = 88;

        // Method 2: declare and initialize together (shortcut)
        int[] scores = {72, 65, 88, 91, 55};
        String[] names = {"Ravi", "Priya", "Amit", "Sneha"};
        System.out.println("First element : " + marks[0]);    // 85
        System.out.println("Last element  : " + marks[4]);    // 88
        System.out.println("Array length  : " + marks.length); // 5

        //traversal
        System.out.println("\n=== Traversal ===");
        System.out.print("Using for loop    : ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        System.out.print("Using for-each    : ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();

        // Find max and min
        System.out.println("max and min");
        int max = scores[0];
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) max = scores[i];
            if (scores[i] < min) min = scores[i];
        }
        System.out.println("Array : 72 65 88 91 55");
        System.out.println("Max   : " + max);  // 91
        System.out.println("Min   : " + min);  // 55

        //sum and average
        System.out.println("sum and average");
        int total = 0;
        for (int s : scores) {
            total += s;
        }
        double average = (double) total / scores.length;
        System.out.println("Sum     : " + total);
        System.out.printf("Average : %.2f%n", average);

        //reverse an array
        System.out.println("reverse an array");
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print("Original : ");
        for (int v : arr) System.out.print(v + " ");
        System.out.println();

        // Swap from both ends moving inward
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.print("Reversed : ");
        for (int v : arr) System.out.print(v + " ");
        System.out.println();

        //linear search
        System.out.println("linear search");
        int[] data = {10, 25, 47, 33, 60};
        int target = 33;
        int foundIndex = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == target) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex != -1) {
            System.out.println(target + " found at index " + foundIndex);
        } else {
            System.out.println(target + " not found");
        }

        //sort an array
        System.out.println("sorting");
        int[] unsorted = {64, 25, 12, 22, 11};
        System.out.print("Before sort : ");
        for (int v : unsorted) System.out.print(v + " ");

        java.util.Arrays.sort(unsorted);  // built-in sort (ascending)

        System.out.print("\nAfter sort  : ");
        for (int v : unsorted) System.out.print(v + " ");
        System.out.println();

        //2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print 2D array
        System.out.println("Matrix:");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }

        // Access specific element
        System.out.println("Element at [1][2] = " + matrix[1][2]);  // 6

        // Sum of all elements in 2D array
        int sum2D = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                sum2D += val;
            }
        }
        System.out.println("Sum of all elements = " + sum2D);  // 45

        //What is the default value of an int array in Java?
        //→ 0 (all elements initialized to 0 by default)

        //What is the default value of a String array?
        //→ null (all elements are null by default)

        //What is ArrayIndexOutOfBoundsException?
        //→ Thrown when you access index >= array.length or index < 0

        //Difference between Array and ArrayList?
        //Array→ fixed size, can store primitives, faster
        //ArrayList → dynamic size, stores only objects, more features
    }
}
