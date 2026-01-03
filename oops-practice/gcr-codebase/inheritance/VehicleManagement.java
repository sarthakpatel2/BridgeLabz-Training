interface Refuelable {
    void refuel();
}
// define the superclass
class Vehicle {
    int maxSpeed;
    String model;
    Vehicle(int maxSpeed, String model){
        this.maxSpeed =maxSpeed;
        this.model= model;
    }
    void displayDetail() {
        System.out.println("Model: "+model +" | Speed: "+maxSpeed +"km/h");
    }
}
// subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    ElectricVehicle(int maxSpeed, String model){
        super(maxSpeed, model);
    }
    void charge() {
        System.out.println(model+" is charging its battery");
    }
}
//petrolVehicle (Hybrid Inheritance)
class PetrolVehicle extends Vehicle implements Refuelable{
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }
    // implementing the interface method
    public void refuel(){
        System.out.println(model+" is refueling at the petrol pump");
    }
}
//main class
public class VehicleManagement{
    public static void main(String[] args){
        ElectricVehicle tesla = new ElectricVehicle(250, "Tesla ");
        PetrolVehicle toyota = new PetrolVehicle(200, "Cadillac ");

        System.out.println("\nEV Details:-");
        tesla.displayDetail();
        tesla.charge();

        System.out.println("\nPetrol Details:-");
        toyota.displayDetail();
        toyota.refuel();
    }
}