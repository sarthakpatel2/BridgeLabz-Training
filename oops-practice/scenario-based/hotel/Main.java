package hotel;
public class Main{
    public static void main(String[] args) {
        Room room = new DeluxeRoom(101);
        Guest guest = new Guest("Sarthak");
        PricingStrategy pricing = new SeasonalPricing();
        try {
            if (!room.available)
                throw new RoomNotAvailableException("Room not available");
            Reservation r = new Reservation(room, guest);
            double bill = pricing.calculate(room.getBasePrice());
            System.out.println("Guest: " +guest.name);
            System.out.println("Room No: "+room.roomNo);
            System.out.println("Bill Amount: "+ bill);
            // Checkout
            room.available = true;
            System.out.println("Checked out successfully");
        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
