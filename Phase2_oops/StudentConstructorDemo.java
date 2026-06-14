// Demonstrates constructor types: default, parameterized, and overloading
// Shows real-world object initialization
class Student{
    String name;
    int age;
    String branch;

    Student(){
        System.out.println("Default Constructor Called");
        name = "Unknown";
        age = 0;
        branch = "Not Assigned";
    }

    Student(String name, int age, String branch) {
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.branch = "CSE"; // default branch
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Branch: " + branch);
    }
}

public class StudentConstructorDemo {
    public static void main(String[] args) {
        
        Student s1=new Student();
        s1.display();

        Student s2=new Student("Shreya",20,"AIML");
        s2.display();

        Student s3=new Student("Rahul",25);
        s3.display();
    }
}
