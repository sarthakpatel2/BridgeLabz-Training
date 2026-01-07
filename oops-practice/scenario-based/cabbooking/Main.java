package cabbooking;
public class Main {
    public static void main(String[] args) {
        RideService service = new RideService();

        service.addDriver(new Driver(1, "Shivam"));
        service.addDriver(new Driver(2, "Madhav"));

        User user1 = new User(1, "Sarthak");
        User user2 = new User(2, "Sanjh");
        User user3 = new User(3, "Aman");

        FareCalculator normalFare = new NormalFare();
        FareCalculator peakFare = new PeakFare();

        User currentUser = null;

        try {
            currentUser = user1;
            service.bookRide(user1, 12, peakFare);

            currentUser = user2;
            service.bookRide(user2, 10, normalFare);

            currentUser = user3;
            service.bookRide(user3, 5, normalFare);

        } catch (NoDriverAvailableException e) {
            System.out.println("User: " + currentUser.name);
            System.out.println("Driver not available");
        }

        System.out.println("\nRide History:");
        service.showRideHistory();
    }
}
