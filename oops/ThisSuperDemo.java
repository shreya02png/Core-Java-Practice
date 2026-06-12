// Demonstrates use of this and super keywords
// Shows constructor chaining and inheritance flow

class Person{
    String name;

    Person(String name){
        this.name=name;
        System.out.println("Person Constructor Called");
    }

    void display() {
        System.out.println("Name: " + name);
    }
}
class Student extends Person{
    int age;

    Student(String name,int age){

        super(name);

        this.age=age;
        System.out.println("Student Constructor Called");
    }
    void showDetails() {
        super.display(); // calling parent method
        System.out.println("Age: " + age);
    }
}

public class ThisSuperDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Shreya", 21);
        s1.showDetails();
    }
}
