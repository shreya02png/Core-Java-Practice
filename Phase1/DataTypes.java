/**
Data Types and Variables
 *
 * Java has 2 types of data types:
 *   1. Primitive     → stores actual value  (8 types)
 *   2. Non-Primitive → stores reference/address (String, Array, Class)
 *
 * PRIMITIVE DATA TYPES
 *   Type     Size      Default    Range
 *   byte     1 byte    0          -128 to 127
 *   short    2 bytes   0          -32768 to 32767
 *   int      4 bytes   0          -2 billion to +2 billion
 *   long     8 bytes   0L         very large numbers
 *   float    4 bytes   0.0f       decimal (6-7 digits precision)
 *   double   8 bytes   0.0d       decimal (15 digits precision)
 *   char     2 bytes   '\u0000'   single character
 *   boolean  1 bit     false      true or false
 */
public class DataTypes {

    public static void main(String[] args) {
        //primitives
        byte age = 21;
        short year = 2024;
        int salary = 500000;
        long population = 1400000000L;   // L suffix required for long
        float percentage = 85.5f;         // f suffix required for float
        double pi = 3.14159265358979;
        char grade = 'A';
        boolean isPlaced = true;
        System.out.println("byte    : " + age);
        System.out.println("short   : " + year);
        System.out.println("int     : " + salary);
        System.out.println("long    : " + population);
        System.out.println("float   : " + percentage);
        System.out.println("double  : " + pi);
        System.out.println("char    : " + grade);
        System.out.println("boolean : " + isPlaced);

        //type casting

        // Widening (automatic) → smaller to bigger type — no data loss
        int num = 100;
        double widened = num;    // int → double, automatic
        System.out.println("\n=== Type Casting ===");
        System.out.println("Widening  (int to double): " + widened);

        // Narrowing (manual) → bigger to smaller type — may lose data
        double price = 99.99;
        int narrowed = (int) price;  // double → int, decimal part lost
        System.out.println("Narrowing (double to int): " + narrowed);  // 99

        //non-primitives

        // String — sequence of characters, immutable in Java
        String name = "Ravi Kumar";
        System.out.println("\n=== Non-Primitive Types ===");
        System.out.println("String  : " + name);
        System.out.println("Length  : " + name.length());
        System.out.println("Upper   : " + name.toUpperCase());
        System.out.println("Substr  : " + name.substring(0, 4));  // Ravi

        //constants
        // final keyword makes a variable constant — value cannot change
        final double TAX_RATE = 0.18;
        System.out.println("\nTax Rate (constant): " + TAX_RATE);

        // What is the default value of int in Java?       → 0
        // What is the default value of boolean in Java?   → false
        // What is the default value of String in Java?    → null
        // Difference between float and double?
        // float  = 4 bytes, 6-7 decimal digits, use f suffix
        // double = 8 bytes, 15 decimal digits, more precise
    }
}
