import java.util.*;
//interface
interface IRentable{
    double calculateRent(int days);
}
//abstract class
abstract class Vehicle implements IRentable{
    protected int vehicleId;
    protected String brand;
    protected double rentPerDay;
    public Vehicle(int vehicleId,String brand,double rentPerDay){
        this.vehicleId=vehicleId;
        this.brand =brand;
        this.rentPerDay=rentPerDay;
    }
    public abstract void displayDetails();
}
//bike class
class Bike extends Vehicle{
    public Bike(int vehicleId, String brand, double rentPerDay){
        super(vehicleId,brand,rentPerDay);
    }
    public double calculateRent(int days){
        return rentPerDay*days;
    }
    public void displayDetails() {
        System.out.println("Bike| ID: "+vehicleId+" |Brand: "+brand+"|Rent/Day: "+rentPerDay);
    }
}
//car class
class Car extends Vehicle{
    public Car(int vehicleId,String brand,double rentPerDay){
        super(vehicleId, brand, rentPerDay);
    }
    public double calculateRent(int days){
        return (rentPerDay*days)+500; //insurance charge
    }
    public void displayDetails(){
        System.out.println("Car| ID: "+vehicleId+" |Brand: "+brand +"|Rent/Day: "+rentPerDay);
    }
}
//truck class
class Truck extends Vehicle{
    public Truck(int vehicleId, String brand, double rentPerDay){
        super(vehicleId, brand, rentPerDay);
    }
    public double calculateRent(int days){
        return (rentPerDay * days) + 1000; //heavy vehicle extra charge
    }
    public void displayDetails(){
        System.out.println("Truck| ID: "+vehicleId+"|Brand: "+brand+"| Rent/Day: ₹"+rentPerDay);
    }
}
//customer class
class Customer{
    protected int customerId;
    protected String name;
    public Customer(int customerId, String name){
        this.customerId=customerId;
        this.name=name;
    }
    public void displayCustomer(){
        System.out.println("Customer ID: "+customerId+", Name: "+name);
    }
}
//service class
class VehicleService{
    private List<Vehicle> vehicles = new ArrayList<>();
    //create
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Vehicle added successfully");
    }
    //read
    public void viewVehicles(){
        if (vehicles.isEmpty()){
            System.out.println("No vehicles available");
            return;
        }
        for (Vehicle v:vehicles){
            v.displayDetails();
        }
    }
    //update
    public void updateRent(int vehicleId, double newRent){
        for (Vehicle v: vehicles){
            if (v.vehicleId==vehicleId){
                v.rentPerDay=newRent;
                System.out.println("Rent updated successfully");
                return;
            }
        }
        System.out.println("Vehicle not found");
    }
    //delete
    public void deleteVehicle(int vehicleId){
        boolean removed=vehicles.removeIf(v->v.vehicleId==vehicleId);
        if(removed){
            System.out.println("Vehicle removed successfully");
        }else{
            System.out.println("Vehicle not found");
        }
    }
    // calculate rent
    public void calculateBill(int vehicleId, int days){
        for (Vehicle v:vehicles){
            if (v.vehicleId==vehicleId){
                System.out.println("Total Rent for "+days+" days: "+v.calculateRent(days));
                return;
            }
        }
        System.out.println("Vehicle not found");
    }
}
//main class
public class VehicleSystem{
    public static void main(String[] args){
        VehicleService service=new VehicleService();
        service.addVehicle(new Bike(1, "Royal Enfield",300));
        service.addVehicle(new Car(2,"Bentley",1000));
        service.addVehicle(new Truck(3,"Daimler",2000));
        System.out.println("\nAll Vehicles :---");
        service.viewVehicles();
        System.out.println("\nCalculate Rent :---");
        service.calculateBill(2, 5);
        System.out.println("\nUpdate Rent :---");
        service.updateRent(1, 350);
        System.out.println("\nDelete Vehicle :---");
        service.deleteVehicle(3);
        System.out.println("\nUpdated Vehicle List :---");
        service.viewVehicles();
    }
}