//package Fundamentals of Java.Day4.Exception;
class Divide {
    int a, b;
    Divide(int a, int b){
        this.a=a;
        this.b=b;
    }
    void divide(){
    try{
        int c = a/b;
        System.out.println("Result " + c);
            
    } catch(ArithmeticException err){

    }
}
}
public class ArithmeticException {
    public static void main(String[] args) {
        
    }
    
}
