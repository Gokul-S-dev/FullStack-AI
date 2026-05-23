class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    String company;
    Employee(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }
}
class Manager extends Employee {
    String department;
    Manager(String name, int age, String company, String department) {
        super(name, age, company);
        this.department = department;
    }
}
public class Multilevel {
    
    public static void main(String[] args){
        Manager manager = new Manager("Alice", 35, "TechCorp", "IT");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Company: " + manager.company);
        System.out.println("Department: " + manager.department);
        
    }
}
