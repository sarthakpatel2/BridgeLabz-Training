package restaurant;
public class Main{
    public static void main(String[] args){
        RestaurantReservationSystem system=new RestaurantReservationSystem();
        system.addTable(new Table(1, 4));
        system.addTable(new Table(2, 6));
        system.addTable(new Table(3, 2));
        try {
            system.reserveTable(1, "Sarthak", "7PM-8PM");
            system.reserveTable(2, "Sanjh", "7PM-8PM");
            system.reserveTable(1, "Shivam", "7PM-8PM"); //exception
        } catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }
        system.showAvailableTables("7PM-8PM");
        system.cancelReservation(1, "7PM-8PM");
        system.showAvailableTables("7PM-8PM");
    }
}
