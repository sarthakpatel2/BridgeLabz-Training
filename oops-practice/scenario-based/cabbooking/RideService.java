package cabbooking;
import java.util.*;
class RideService {
    List<Driver> drivers = new ArrayList<>();
    List<Ride> rideHistory = new ArrayList<>();

    void addDriver(Driver driver) {
        drivers.add(driver);
    }
    Driver assignDriver() throws NoDriverAvailableException {
        for (Driver driver : drivers) {
            if (driver.isAvailable) {
                driver.isAvailable = false;
                return driver;
            }
        }
        throw new NoDriverAvailableException("No driver available");
    }
    Ride bookRide(User user, double distance, FareCalculator fareCalculator)
            throws NoDriverAvailableException {
        Ride ride = new Ride(user, distance);
        ride.driver = assignDriver();
        ride.fare = fareCalculator.calculateFare(distance);
        ride.status = "Completed";
        rideHistory.add(ride);
        return ride;
    }
    void showRideHistory() {
        for (Ride ride : rideHistory){
            System.out.println("User: "+ride.user.name+", Driver: "+ride.driver.name+", Distance: "+ride.distance+" km, Fare: "+ride.fare+", Status: "+ride.status);
        }
    }
}
