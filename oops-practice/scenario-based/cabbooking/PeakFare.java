package cabbooking;

class PeakFare implements FareCalculator {
    public double calculateFare(double distance) {
        return distance * 20;
    }
}
