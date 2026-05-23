class Student {
    String name;
    int rollNo;
    int marks;
    Student(String name, int rollNo, int marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Marks: "+marks);
    }
}

class StudentManagement {
    public static void main(String[] args){
        Student s1 = new Student("Alice",1,85);
        Student s2 = new Student("Bob",2,90);

        s1.display();
        System.out.println();
        s2.display();

    }
}
