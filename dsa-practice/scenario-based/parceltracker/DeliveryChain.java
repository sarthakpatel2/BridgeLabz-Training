package parceltracker;

public class DeliveryChain{
    private Stage head;
    // initialize default delivery stages
    public void initializeChain() {
        head = new Stage("Packed");
        head.next = new Stage("Shipped");
        head.next.next = new Stage("In Transit");
        head.next.next.next = new Stage("Delivered");
    }
    // Forward tracking
    public void trackParcel() {
        if (head == null) {
            System.out.println("Parcel lost: No data available");
            return;
        }

        Stage current = head;
        System.out.print("Parcel Status: ");
        while (current != null) {
            System.out.print(current.name + "→");
            current = current.next;
        }
        System.out.println("End");
    }
    // Add intermediate checkpoint
    public void addCheckpoint(String afterStage, String newStage) {
        Stage current = head;
        while (current != null && !current.name.equalsIgnoreCase(afterStage)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Stage not found: " + afterStage);
            return;
        }
        Stage checkpoint = new Stage(newStage);
        checkpoint.next = current.next;
        current.next = checkpoint;

        System.out.println("Added checkpoint: " + newStage);
    }
    // Simulate lost parcel (null pointer)
    public void markParcelLost() {
        head = null;
        System.out.println("Parcel marked as lost!");
    }
}
