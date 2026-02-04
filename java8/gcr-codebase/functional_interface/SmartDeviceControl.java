interface SmartDevice{
    void turnOn();
    void turnOff();
}
class Light implements SmartDevice{
    public void turnOn(){
        System.out.println("Light turned ON");
    }
    public void turnOff(){
        System.out.println("Light turned OFF");
    }
}
class AirConditioner implements SmartDevice{
    public void turnOn(){
        System.out.println("AC started");
    }
    public void turnOff(){
        System.out.println("AC stopped");
    }
}
class Television implements SmartDevice{
    public void turnOn(){
        System.out.println("TV turned ON");
    }
    public void turnOff(){
        System.out.println("TV turned OFF");
    }
}
public class SmartDeviceControl{
    public static void main(String[] args){
        SmartDevice d1=new Light();
        SmartDevice d2=new AirConditioner();
        SmartDevice d3=new Television();
        d1.turnOn();
        d2.turnOn();
        d3.turnOn();
        d1.turnOff();
        d2.turnOff();
        d3.turnOff();
    }
}