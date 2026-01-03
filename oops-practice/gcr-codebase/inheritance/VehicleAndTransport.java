class Vehicle {
    int maxSpeed;
    String fuelType;
    //constructor
    Vehicle(int maxSpeed, String fuelType){
        //initialize parent class properties
        this.maxSpeed =maxSpeed;
        this.fuelType=fuelType;
    }
    void displayInfo() {
        System.out.println("Max Speed: "+maxSpeed);
        System.out.println("Fuel Type: "+fuelType);
    }
}
//car subclass
class Car extends Vehicle{
    int seatCapacity;
    Car(int maxSpeed,String fuelType,int seatCapacity){
        super(maxSpeed,fuelType);
        //calling the parent constructor
        this.seatCapacity=seatCapacity;
    }
    @Override
    void displayInfo(){
        //call the parent method
        super.displayInfo();
        System.out.println("Seat Capacity: "+seatCapacity);
    }
}
//truck subclass
class Truck extends Vehicle{
    int loadCapacity;
    Truck(int maxSpeed,String fuelType, int loadCapacity) {
        //calling the parent constructor
        super(maxSpeed,fuelType);
        this.loadCapacity=loadCapacity;
    }
    @Override
    void displayInfo(){
        //call parent method
        super.displayInfo();
        System.out.println("Load Capacity: "+loadCapacity+" tons");
    }
}
//motorcycle subclass
class Motorcycle extends Vehicle{
    boolean hasCarrier;
    //constructor
    Motorcycle(int maxSpeed,String fuelType, boolean hasCarrier){
        //calling the parent costructor
        super(maxSpeed, fuelType);
        this.hasCarrier=hasCarrier;
    }
    @Override
    void displayInfo(){
        //call parent method
        super.displayInfo();
        System.out.println("Carrier Available: "+hasCarrier);
    }
}
//main class
public class VehicleAndTransport{
    public static void main(String[] args){
        //create vehicle object
        Vehicle[] vehicle=new Vehicle[3];
        vehicle[0]=new Car(180,"Petrol",5);
        vehicle[1]=new Truck(120,"Diesel",15);
        vehicle[2]=new Motorcycle(150,"Petrol", true);
        //display info
        for (Vehicle v:vehicle){
            v.displayInfo();
            System.out.println();
        }
    }
}
