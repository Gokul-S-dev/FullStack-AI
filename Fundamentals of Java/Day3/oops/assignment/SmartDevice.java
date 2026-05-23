interface SmartDeviceInterface {
    void turnOn();
    void turnOff();
}

class SmartTV implements SmartDeviceInterface {
    @Override
    public void turnOn() {
        System.out.println("Smart TV is turned on.");
    }

    @Override
   public void turnOff() {
        System.out.println("Smart TV is turned off.");
    }
}

class SmartPhone implements SmartDeviceInterface {
    @Override
    public void turnOn(){
        System.out.println("Smart Phone is turned on.");
    }

    @Override
    public void turnOff(){
        System.out.println("Smart Phone is turned off.");
    }
}
public class SmartDevice {
    public static void main(String[] args){
        SmartTV tv = new SmartTV();
        tv.turnOn();
        tv.turnOff();

        SmartPhone phone = new SmartPhone();
        phone.turnOn();
        phone.turnOff();
    }
}
