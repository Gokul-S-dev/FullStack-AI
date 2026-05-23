class Vehicle{
    void start(){
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car is starting");
    }
}

class Bike extends Vehicle{
    @Override
    void start(){
        System.out.println("Bike is starting");
    }
}
public class VehicleInheritance {
    public static void main(String[] args){
        Vehicle v1 = new Vehicle();
        v1.start();

        Car c1 = new Car();
        c1.start();

        Bike b1 = new Bike();
        b1.start();

        Vehicle v2 = new Car();
        v2.start();

    }
}
