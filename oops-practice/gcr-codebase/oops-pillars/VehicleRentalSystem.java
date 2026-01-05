interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}
//abstract class
abstract class Vehicle{
    protected String vehicleNumber;
    protected String type;
    protected double rentalRate;
    //encapsulated policy number
    private String insurancePolicyNumber;
    public Vehicle(String vehicleNumber,String type,double rentalRate,String policyNumber) {
        this.vehicleNumber =vehicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
        this.insurancePolicyNumber=policyNumber;
    }
    //getter
    public String getInsurancePolicyNumber() {
        return "***"+insurancePolicyNumber.substring(0,3)+"***";
    }
    abstract double calculateRentalCost(int days);
}
//car class
class Car extends Vehicle implements Insurable{
    public Car(String number,double rate,String policy){
        super(number, "Car",rate,policy);
    }
    public double calculateRentalCost(int days){
        return rentalRate*days;
    }
    public double calculateInsurance(){
        return 1000;
    }
    public String getInsuranceDetails(){
        return "Car Insurance";
    }
}
//bike class
class Bike extends Vehicle implements Insurable{
    public Bike(String number, double rate, String policy){
        super(number, "Bike", rate, policy);
    }
    public double calculateRentalCost(int days){
        return rentalRate*days;
    }
    public double calculateInsurance(){
        return 500;
    }
    public String getInsuranceDetails(){
        return "Bike Insurance";
    }
}
//truck class
class Truck extends Vehicle implements Insurable{
    public Truck(String number, double rate, String policy){
        super(number,"Truck",rate,policy);
    }
    public double calculateRentalCost(int days){
        return rentalRate*days;
    }
    public double calculateInsurance(){
        return 10000;
    }
    public String getInsuranceDetails(){
        return "Truck Insurance";
    }
}
//Main class
public class VehicleRentalSystem{
    public static void main(String[] args){
        Vehicle[] vehicles=new Vehicle[3];
        vehicles[0]=new Car("C01",3000,"CAR12");
        vehicles[1]=new Bike("B02",400,"BIK12");
        vehicles[2]=new Truck("T03",5000,"TRK12");
        int days=3;
        for (Vehicle v:vehicles){
            Insurable ins=(Insurable) v; //polymorphism
            System.out.println("Vehicle Type: " +v.type);
            System.out.println("Rental Cost: "+v.calculateRentalCost(days));
            System.out.println("Insurance Cost: "+ins.calculateInsurance());
            System.out.println("Insurance Details: "+ins.getInsuranceDetails());
            System.out.println("Policy No: "+v.getInsurancePolicyNumber());
            System.out.println();
        }
    }
}
