package cabbooking;

class Ride {
    User user;
    Driver driver;
    double distance;
    double fare;
    String status;

    Ride(User user, double distance) {
        this.user = user;
        this.distance = distance;
        this.status = "Booked";
    }
}
