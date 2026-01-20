package trafficmanager;

public class TrafficManager {
    public static void main(String[] args) {
        Roundabout roundabout = new Roundabout();
        WaitingQueue queue = new WaitingQueue(3);
        // Vehicles arrive
        queue.enqueue("CAR-01");
        queue.enqueue("CAR-02");
        queue.enqueue("CAR-03");
        queue.enqueue("CAR-04"); //overflow
        // Vehicles enter roundabout
        roundabout.addVehicle(queue.dequeue());
        roundabout.addVehicle(queue.dequeue());
        roundabout.printState();
        // Vehicle exits
        roundabout.removeVehicle();
        roundabout.printState();
        // New vehicle enters
        roundabout.addVehicle(queue.dequeue());
        roundabout.printState();
        // Underflow case
        queue.dequeue();
    }
}
