/**
 Hello World + How Java Works
Step 1: You write code in a .java file
Step 2: Compiler (javac) converts it to .class file (bytecode)
Step 3: JVM (Java Virtual Machine) runs the .class file on any OS
 * KEY TERMS:
 *   JDK  - Java Development Kit   → write + compile + run
 *   JRE  - Java Runtime Env       → only run
 *   JVM  - Java Virtual Machine   → converts bytecode to machine code
 *
 * WHY JAVA IS PLATFORM INDEPENDENT:
 *   Because .class (bytecode) runs on any OS that has JVM installed.
 *   "Write Once, Run Anywhere" — this is Java's motto.
 */
public class HelloWorld {

    // main() is the entry point of every Java program
    // public  → accessible from anywhere
    // static  → no object needed to call this method
    // void    → returns nothing
    // String[] args → command line arguments
    public static void main(String[] args) {
        System.out.print("Hello ");
        System.out.println("World!");
        // print formatted output
        System.out.printf("My name is %s and I am %d years old.%n", "Shreya", 21);
    }
}
