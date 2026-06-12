// Demonstrates interface usage, multiple inheritance,
// and default methods in Java
interface Engine{
    void start(); //abstract method
}

interface MusicSystem {
    void playMusic();  // abstract method
}
interface GPS {
    default void navigation() {
        System.out.println("GPS Navigation Started");
    }
}
class Car implements Engine,MusicSystem,GPS{
    public void start(){
        System.out.println("Car engine starts with button");
    }

    public void playMusic() {
        System.out.println("Playing music in car");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Car c=new Car();

        c.start();
        c.playMusic();
        c.navigation(); // default method
    }
}
