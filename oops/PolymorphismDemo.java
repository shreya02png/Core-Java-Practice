// Demonstrates polymorphism using method overloading and overriding
// Includes runtime polymorphism (dynamic method dispatch)

// File: PolymorphismDemo.java

// Base Class
class Animal {
    // Method to be overridden
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child Class 1
class Dog extends Animal {

    // Method Overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Child Class 2
class Cat extends Animal {

    // Method Overriding
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// 🔹 Method Overloading Example
class Calculator {

    // Same method name, different parameters

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {

        // Runtime Polymorphism (Dynamic Method Dispatch)
        Animal a;

        a = new Dog();
        a.sound();   // Dog's method called

        a = new Cat();
        a.sound();   // Cat's method called

        // Compile-time Polymorphism
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));        // int version
        System.out.println(calc.add(2.5, 3.5));    // double version
        System.out.println(calc.add(1, 2, 3));     // 3 params
    }
}
