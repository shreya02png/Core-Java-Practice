// Demonstrates important Java keywords: final, static,
// this, super, and instanceof with real examples
// Parent Class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void show() {
        System.out.println("Animal Name: " + name);
    }
}

// Child Class
class Dog extends Animal {

    // static variable (shared across all objects)
    static int count = 0;

    final String type = "Dog"; // constant value

    Dog(String name) {
        super(name); // calling parent constructor
        count++;
    }

    void display() {
        // this → current object
        System.out.println("Name: " + this.name);

        // final variable
        System.out.println("Type: " + type);

        // static variable
        System.out.println("Total Dogs Created: " + count);
    }
}

public class KeywordsDemo {

    // static method
    static void checkInstance(Animal a) {

        // instanceof keyword
        if (a instanceof Dog) {
            System.out.println("This is a Dog object");
        } else {
            System.out.println("Not a Dog");
        }
    }

    public static void main(String[] args) {

        Dog d1 = new Dog("Buddy");
        Dog d2 = new Dog("Rocky");

        d1.display();
        System.out.println("------------------");
        d2.display();

        System.out.println("------------------");

        checkInstance(d1);
    }
}