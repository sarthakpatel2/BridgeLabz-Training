class CarRentalSystem{
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500;
    // Default constructor
    CarRentalSystem() {
        customerName="Customer";
        carModel="Hatchback";
        rentalDays=1;
    }
    // parameterized constructor
    CarRentalSystem(String customerName, String carModel, int rentalDays) {
        this.customerName =customerName;
        this.carModel=carModel;
        this.rentalDays= rentalDays;
    }
    double calculateTotalCost() {
        return rentalDays*costPerDay;
    }
    void display() {
        System.out.println(customerName+" rented "+carModel +" for "+rentalDays+" days. Total Cost: ₹"+calculateTotalCost());
    }
    public static void main(String[] args){
        CarRentalSystem cr = new CarRentalSystem("Amit", "Sedan", 4);
        cr.display();
    }
}
