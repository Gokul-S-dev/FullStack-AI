// package Fundamentals of Java.Day3.oops;

class Student {
    String name;
    int roll_no;
    int age;
    int sum;
    int avg;
    char grade;
    // Constructor to load the basic information
    Student(String name, int roll_no, int age){
        this.name=name;
        this.roll_no=roll_no;
        this.age=age;
    }
   
    // method to perform calculation
    void calculation(int sub1, int sub2, int sub3){
        sum = sub1+sub2+sub3;
        avg = sum/3;
        gradeCalc(); // after calculation call the grade calculation method
    }
    //Grade Calculation logic
    void gradeCalc(){
        if(avg>=90){
            grade='A';
        }else if(avg>=80 && avg<90){
            grade='B';
        }else if(avg>=70 && avg<80){
            grade='C';
        }else{
            grade='D';
        }
        display();// call display  
    }

    // It display the output
   void display(){
        System.out.println("Total mark "+ sum);
        System.out.println("Average mark "+avg);
        System.out.println("Grade "+ grade);
    }
}
public class StudentGradeSystem {
    public static void main(String[] args){
        Student gokul = new Student("Gokul",31,18);
        gokul.calculation(90, 90, 90);


    }
    
}
