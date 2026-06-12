/**
 Loops
 * Loops repeat a block of code multiple times.
 * Types of loops in Java:
 *   1. for loop          → when you know how many times to repeat
 *   2. while loop        → when you repeat based on a condition
 *   3. do-while loop     → runs at least once, then checks condition
 *   4. for-each loop     → used to iterate over arrays and collections
 *   5. break & continue  → control loop execution
 */
public class Loops {

    public static void main(String[] args) {

        //for-loop
        System.out.println("for-loop");

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //while loop
        System.out.println("while loop");

        int n = 1;
        while (n <= 5) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println();

        //do-while loop
        System.out.println("do-while loop");

        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);
        System.out.println();

        //for-each loop
        System.out.println("for-each loop");

        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // nested loop
        System.out.println("nested loop");
        // Print a star pattern
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //break AND continue
        System.out.println("break AND continue");

        for (int j = 1; j <= 10; j++) {
            if (j == 6) break;
            System.out.print(j + " ");
        }
        System.out.println();

        System.out.println("continue");

        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) continue;
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
