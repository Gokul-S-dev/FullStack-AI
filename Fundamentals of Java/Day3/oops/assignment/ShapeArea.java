abstract class Shape{
    abstract void area();
}

class Circle extends Shape{
    @Override
    void area(){
        System.out.println("Area of Circle: πr²");
    }
}

class Rectangle extends Shape{
    @Override
    void area(){
        System.out.println("Area of Rectangle: length * width");
    }
}

public class ShapeArea {
    public static void main(String[] args){
        Shape s1 = new Circle();
        s1.area();

        Shape s2 = new Rectangle();
        s2.area();
    }
    
}
