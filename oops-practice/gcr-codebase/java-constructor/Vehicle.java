class Vehicle {
    // instance variables
    String ownerName;
    String vehicleType;
    // Class variable
    static double registrationFee =2000.0;
    // parameterized constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName= ownerName;
        this.vehicleType=vehicleType;
    }
    //instance method
    void displayVehicleDetails() {
        System.out.println("Owner Name: "+ownerName);
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Registration Fee: "+registrationFee);
        System.out.println();
    }
    // class method
    static void updateRegistrationFee(double newFee) {
        registrationFee=newFee;
    }
    public static void main(String[] args){
        Vehicle v1 = new Vehicle("Rohit", "Car");
        Vehicle v2 = new Vehicle("Anita", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        // update registration fee for all vehicles
        Vehicle.updateRegistrationFee(2500.0);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
