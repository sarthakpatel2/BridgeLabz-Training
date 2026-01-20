package trafficmanager;

public class Roundabout {
    private Vehicle tail;
    public Roundabout() {
        tail = null;
    }
    // Add vehicle to circular path
    public void addVehicle(String vehicleNumber) {
        Vehicle newVehicle = new Vehicle(vehicleNumber);

        if (tail == null) {
            tail = newVehicle;
            tail.next = tail;
        } else {
            newVehicle.next = tail.next;
            tail.next = newVehicle;
            tail = newVehicle;
        }
        System.out.println("Vehicle " + vehicleNumber + " entered roundabout");
    }

    // remove vehicle from circular path
    public void removeVehicle() {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        Vehicle head = tail.next;

        if (head == tail) {
            System.out.println(" Vehicle " + head.vehicleNumber + " exited roundabout");
            tail = null;
        } else {
            System.out.println("Vehicle " + head.vehicleNumber + " exited roundabout");
            tail.next = head.next;
        }
    }
    // print roundabout state
    public void printState() {
        if (tail == null) {
            System.out.println("Roundabout is empty");
            return;
        }

        System.out.print("Roundabout: ");
        Vehicle current = tail.next;
        do {
            System.out.print(current.vehicleNumber +"-> ");
            current = current.next;
        } while (current != tail.next);
        System.out.println("(back to start)");
    }
}
