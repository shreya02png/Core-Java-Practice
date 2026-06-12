// Demonstrates abstraction using abstract class and methods
// Shows how different vehicles implement start() differently
abstract class Vehicle{
    //Abstract Class
    String brand;

    Vehicle(String brand) {
        this.brand=brand;
    }
    // Abstract method (no body)
    abstract void start();
    // Concrete method (has body)
    void displayBrand(){
        System.out.println("Brand: "+brand);
    }
}

class Car extends Vehicle{
    Car(String brand){
        super(brand);
    }
    void start(){
        System.out.println("Car starts with a key or button");
    }
}

class Bike extends Vehicle{
    Bike(String brand){
        super(brand);
    }
    void start(){
        System.out.println("Bike starts with a kick or self-start");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle v;

        v=new Car("Tesla");
        v.displayBrand();
        v.start();

        System.out.println("------------------");

        v=new Bike("Honda");
        v.displayBrand();
        v.start();
    }
}
