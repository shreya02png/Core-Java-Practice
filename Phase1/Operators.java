/**
 Operators 
 * Types of operators in Java:
 *   1. Arithmetic        → +  -  *  /  %
 *   2. Relational        → ==  !=  >  <  >=  <=
 *   3. Logical           → &&  ||  !
 *   4. Assignment        → =  +=  -=  *=  /=
 *   5. Unary             → ++  --  +  -
 *   6. Bitwise           → &  |  ^  ~  <<  >>
 *   7. Ternary           → condition ? valueIfTrue : valueIfFalse
 */
public class Operators {

    public static void main(String[] args) {

        // 1. ARITHMETIC OPERATORS
        System.out.println("Arithmetic Operators");
        int a = 10, b = 3;
        System.out.println("a + b = " + (a + b));   // 13
        System.out.println("a - b = " + (a - b));   // 7
        System.out.println("a * b = " + (a * b));   // 30
        System.out.println("a / b = " + (a / b));   // 3  (integer division)
        System.out.println("a % b = " + (a % b));   // 1  (remainder/modulo)

        // 10 / 3 = 3 (not 3.33) because both are int to get 3.33: use (double)a / b
        System.out.println("(double)a / b = " + (double) a / b);  // 3.333

        // 2. RELATIONAL OPERATORS
        System.out.println("Relational Operators");
        System.out.println("a == b : " + (a == b));  // false
        System.out.println("a != b : " + (a != b));  // true
        System.out.println("a >  b : " + (a > b));   // true
        System.out.println("a <  b : " + (a < b));   // false
        System.out.println("a >= b : " + (a >= b));  // true
        System.out.println("a <= b : " + (a <= b));  // false

        // 3. LOGICAL OPERATORS
        System.out.println("Logical Operators");
        boolean x = true, y = false;
        System.out.println("x && y : " + (x && y));  // false (AND — both must be true)
        System.out.println("x || y : " + (x || y));  // true  (OR  — at least one true)
        System.out.println("!x     : " + (!x));       // false (NOT — reverses value)

        // 4. ASSIGNMENT OPERATORS
        System.out.println("Assignment Operators");
        int n = 10;
        n += 5;   System.out.println("n += 5  : " + n);  // 15
        n -= 3;   System.out.println("n -= 3  : " + n);  // 12
        n *= 2;   System.out.println("n *= 2  : " + n);  // 24
        n /= 4;   System.out.println("n /= 4  : " + n);  // 6
        n %= 4;   System.out.println("n %= 4  : " + n);  // 2

        // 5. UNARY OPERATORS
        System.out.println("Unary Operators");
        int p = 5;
        System.out.println("p++  : " + p++);  // 5  (print first,then increment)
        System.out.println("p    : " + p);    // 6
        System.out.println("++p  : " + ++p);  // 7  (increment first,then print)
        System.out.println("p--  : " + p--);  // 7  (print first,then decrement)
        System.out.println("p    : " + p);    // 6
        System.out.println("--p  : " + --p);  // 5  (decrement first,then print)

        // 6. TERNARY OPERATOR
        System.out.println("Ternary Operator");
        int marks = 75;
        // syntax: condition ? value_if_true : value_if_false
        String result = (marks >= 50) ? "Pass" : "Fail";
        System.out.println("Result: " + result);  // Pass

        int x1 = 10, x2 = 20;
        int max = (x1 > x2) ? x1 : x2;
        System.out.println("Max of " + x1 + " and " + x2 + " is: " + max);  // 20

        // 7. BITWISE OPERATORS (basic awareness)
        System.out.println("Bitwise Operators");
        int m = 5;   // binary: 0101
        int k = 3;   // binary: 0011
        System.out.println("m & k  = " + (m & k));   // 0001 = 1  (AND)
        System.out.println("m | k  = " + (m | k));   // 0111 = 7  (OR)
        System.out.println("m ^ k  = " + (m ^ k));   // 0110 = 6  (XOR)
        System.out.println("m << 1 = " + (m << 1));  // 1010 = 10 (left shift = multiply by 2)
        System.out.println("m >> 1 = " + (m >> 1));  // 0010 = 2  (right shift = divide by 2)

        // Left shift by 1 = multiply by 2
        // Right shift by 1 = divide by 2
    }
}
