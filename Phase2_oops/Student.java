// Demonstrates basic Class and Object concept using Student example

class StudentDemo{

    String name;
    int age;
    String branch;

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Branch: "+branch);
    }
}
public class Student{
    public static void main(String[] args) {
        StudentDemo s=new StudentDemo();
        s.name="Shreya";
        s.age=20;
        s.branch="AIML";
        s.display();
    }
    
}