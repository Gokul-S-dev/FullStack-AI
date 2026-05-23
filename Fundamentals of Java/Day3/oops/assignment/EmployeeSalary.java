class Employee {
    void calculateSalary() {
        System.out.println("Calculating salary for Employee");
    }
}

class FullTimeEmployee extends Employee{
    @Override
    void calculateSalary() {
        System.out.println("Calculating salary for Full Time Employee");
    }
}

class PartTimeEmployee extends Employee{
    @Override
    void calculateSalary(){
        System.out.println("Calculating salary for Part Time Employee");
    }
}

public class EmployeeSalary {
    public static void main(String[] args){
        Employee emp1 = new FullTimeEmployee();
        Employee emp2 = new PartTimeEmployee();

        emp1.calculateSalary();
        emp2.calculateSalary();
    }
    
}
