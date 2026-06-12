/**Methods
 *
 * A method is a block of code that performs a specific task.
 * You define it once and call it wherever needed — avoids repetition.
 *
 * Method syntax:
 *   accessModifier returnType methodName(parameters) {
 *       // body
 *       return value;  // only if returnType is not void
 *   }
 *
 * Types of methods:
 *   1. No parameter, no return
 *   2. With parameters, no return
 *   3. No parameter, with return
 *   4. With parameters, with return
 *   5. Method overloading
 *   6. Recursive method
 */
public class Methods {

    //TYPE 1:No parameter,no return (void)
    static void greet() {
        System.out.println("Hello! Welcome to Java.");
    }

    //TYPE 2:With parameters,no return
    static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    //TYPE 3:No parameter,with return
    static int getYear() {
        return 2024;
    }

    //TYPE 4:With parameters,with return
    static int add(int a, int b) {
        return a + b;
    }

    static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    //TYPE 5: METHOD OVERLOADING
    //Same method name,different parameters
    //Decided at COMPILE TIME (static polymorphism)
    static int multiply(int a, int b) {
        System.out.println("int version called");
        return a * b;
    }

    static double multiply(double a, double b) {
        System.out.println("double version called");
        return a * b;
    }

    static int multiply(int a, int b, int c) {
        System.out.println("3 param version called");
        return a * b * c;
    }

    //TYPE 6: RECURSIVE METHOD
    // A method that calls itself
    // Must have a base case to stop — otherwise StackOverflowError

    // Factorial using recursion: n! = n * (n-1)!
    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;  // base case
        return n * factorial(n - 1);     // recursive call
    }

    // Fibonacci using recursion
    static int fibonacci(int n) {
        if (n <= 1) return n;             // base case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //MAIN METHOD
    public static void main(String[] args) {

        //Calling Type 1
        System.out.println("No Param, No Return");
        greet();

        //Calling Type 2
        System.out.println("With Param, No Return");
        greetUser("Ravi");
        greetUser("Priya");

        //Calling Type 3
        System.out.println("No Param, With Return");
        int year = getYear();
        System.out.println("Current year: " + year);

        //Calling Type 4
        System.out.println("With Param, With Return");
        int result = add(10, 20);
        System.out.println("Sum: " + result);

        double si = calculateSimpleInterest(10000, 8, 2);
        System.out.println("Simple Interest: " + si);

        // Calling Method Overloading
        System.out.println("Method Overloading");
        System.out.println(multiply(4, 5));           // calls int version
        System.out.println(multiply(2.5, 3.0));       // calls double version
        System.out.println(multiply(2, 3, 4));         // calls 3 param version

        // Calling Recursive methods
        System.out.println("Recursion");
        System.out.println("Factorial of 5 = " + factorial(5));  // 120
        System.out.println("Factorial of 0 = " + factorial(0));  // 1

        System.out.println("Fibonacci series (first 7):");
        for (int i = 0; i < 7; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();  // 0 1 1 2 3 5 8

        // What is method overloading?
        // Same method name, different parameter list (type or count).
        // Resolved at compile time. Also called static polymorphism.

        // What is the difference between overloading and overriding?
        // Overloading → same class, different parameters (compile time)
        // Overriding  → parent-child class, same signature (runtime)

        // Can we overload the main() method?
        // Yes. But JVM always calls the standard one: main(String[] args)

        // What is recursion?
        // A method calling itself. Must have a base case to stop.
        // Factorial and Fibonacci are classic examples.
    }
}
