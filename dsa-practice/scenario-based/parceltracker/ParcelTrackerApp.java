package parceltracker;

public class ParcelTrackerApp{
    public static void main(String[] args) {
        DeliveryChain chain=new DeliveryChain();
        // Initialize delivery stages
        chain.initializeChain();
        chain.trackParcel();
        // Add custom checkpoint
        chain.addCheckpoint("Shipped","Customs Check");
        chain.trackParcel();
        // Handle lost parcel
        chain.markParcelLost();
        chain.trackParcel();
    }
}
