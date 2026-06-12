/**
 * Control Flow — if-else and switch
 * Control flow decides WHICH block of code runs based on a condition.
 * Types:
 *   1. if
 *   2. if-else
 *   3. if-else-if ladder
 *   4. nested if
 *  5. switch-case
 */
public class ControlFlow {

    public static void main(String[] args) {

        //if STATEMENT
        System.out.println("if Statement");
        int marks = 85;
        if (marks >= 75) {
            System.out.println("Distinction");
        }

        // if-else STATEMENT
        System.out.println("\nif-else Statement");
        int age = 17;
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        //if-else-if LADDER
        System.out.println(" \nif-else-if Ladder");
        int score = 72;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 60) {
            System.out.println("Grade: C");
        } else if (score >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F — Fail");
        }

        //nested if
        System.out.println("nested if");
        int salary = 60000;
        boolean hasExperience = true;
        if (salary >= 50000) {
            if (hasExperience) {
                System.out.println("Eligible for senior role");
            } else {
                System.out.println("Eligible for junior role");
            }
        } else {
            System.out.println("Not eligible");
        }

        // switch-case STATEMENT
        System.out.println("switch-case Statement");
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }


        //What happens if you forget break in switch?
        // It causes "fall-through" — all cases below also execute
        // until a break or end of switch is reached.

        //What values can switch work with?
        //byte, short, int, char, String, and Enum
        //NOTE: switch does NOT work with long, float, double, boolean
    }
}
