class GrandParent {
    void message(){
        System.out.println("I am the grandparent.");
    }
}

class Parent extends GrandParent {
    void message() {
        System.out.println("I am the parent.");
    }
}

class Child extends Parent {
    void message() {
        System.out.println("I am the child.");
    }
    void displayMessage(){
        // Accessing the message method of the Parent class using super
        super.message();
        // Accessing the message method of the Parent class
        this.message();
    }
}
public class ConstructorChaining {
    public static void main(String[] args){
        Child child = new Child();
        child.message(); 
        child.displayMessage();
    }
    
}
