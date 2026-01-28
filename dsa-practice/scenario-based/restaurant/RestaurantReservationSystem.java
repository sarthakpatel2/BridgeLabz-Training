package restaurant;
import java.util.*;
public class RestaurantReservationSystem{
    private Map<Integer, Table> tables=new HashMap<>();
    private List<Reservation> reservations=new ArrayList<>();
    public void addTable(Table table) {
        tables.put(table.getTableNumber(), table);
    }
    public void reserveTable(int tableNumber, String customerName, String timeSlot) throws TableAlreadyReservedException{
        for (Reservation r:reservations){
            if (r.getTableNumber()==tableNumber &&r.getTimeSlot().equals(timeSlot)){
                throw new TableAlreadyReservedException("Table "+tableNumber+" already reserved for "+timeSlot);
            }
        }
        reservations.add(new Reservation(tableNumber, customerName, timeSlot));
        System.out.println("Reservation successful for "+customerName);
    }
    public void cancelReservation(int tableNumber, String timeSlot){
        reservations.removeIf(r->r.getTableNumber()==tableNumber &&r.getTimeSlot().equals(timeSlot));
        System.out.println("Reservation cancelled.");
    }
    public void showAvailableTables(String timeSlot){
        System.out.println("Available tables for "+timeSlot+":");
        for (Table table :tables.values()){
            boolean isReserved=false;
            for (Reservation r:reservations){
                if (r.getTableNumber()==table.getTableNumber()&&r.getTimeSlot().equals(timeSlot)){
                    isReserved=true;
                    break;
                }
            }
            if (!isReserved){
                System.out.println("Table "+table.getTableNumber()+" (Capacity: "+table.getCapacity()+")");
            }
        }
    }
}
