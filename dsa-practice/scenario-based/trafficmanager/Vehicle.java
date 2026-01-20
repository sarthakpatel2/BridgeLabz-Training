package trafficmanager;
public class Vehicle {
    String vehicleNumber;
    Vehicle next;
    public Vehicle(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
        this.next = null;
    }
}
