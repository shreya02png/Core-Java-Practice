// Demonstrates inheritance types: single, multilevel, hierarchical
// Shows real-world Employee hierarchy and code reuse

class Employee{
    String name;
    double salary;

    Employee(String name,double salary) {
        this.name=name;
        this.salary=salary;
    }

    void display(){
        System.out.println("name: "+name);
        System.out.println("salary: "+salary);
    }
}
class Developer extends Employee{
    String language;

    Developer(String name,double salary,String language) {
        super(name, salary);
        this.language=language;
    }
    void showDeveloper() {
        display();
        System.out.println("Language: " + language);}
}
class SeniorDeveloper extends Developer{
    int experience;

    SeniorDeveloper(String name,double salary,String language,int experience) {
        super(name, salary,language);
        this.experience=experience;
    }
    void showExperience() {
        showDeveloper();
        System.out.println("Experience: " + experience);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    void showManager() {
        display();
        System.out.println("Team Size: " + teamSize);
    }
}


public class InheritanceDemo {
    public static void main(String[] args) {
        Developer dev = new Developer("Shreya", 50000, "Java");
        dev.showDeveloper();

        SeniorDeveloper senior = new SeniorDeveloper("Rahul", 80000, "Python", 5);
        senior.showExperience();

        Manager mgr = new Manager("Anita", 90000, 10);
        mgr.showManager();
    }
}
