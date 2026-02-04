interface Vehicle{
    void displaySpeed();
    //added later for electric vehicles
    default void displayBatteryStatus(){
        System.out.println("Battery status: Not applicable");
    }
}
class Car implements Vehicle{
    public void displaySpeed(){
        System.out.println("Car speed: 80 km/h");
    }
}
class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Electric Car speed: 60 km/h");
    }
    // Override default method
    public void displayBatteryStatus(){
        System.out.println("Battery level: 85%");
    }
}
public class SmartVehicle{
    public static void main(String[] args){
        Vehicle v1=new Car();
        Vehicle v2=new ElectricCar();
        v1.displaySpeed();
        v1.displayBatteryStatus();
        System.out.println();
        v2.displaySpeed();
        v2.displayBatteryStatus();
    }
}
