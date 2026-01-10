import java.util.*;
//flight class
class Flight{
    int flightId;
    String source;
    String destination;
    String airline;
    double price;
    Flight(int flightId,String source,String destination,String airline,double price){
        this.flightId= flightId;
        this.source=source;
        this.destination =destination;
        this.airline=airline;
        this.price=price;
    }
    void displayFlight(){
        System.out.println("ID: "+flightId+"|"+airline+"|"+source+"-"+destination+"|Price: "+price);
    }
}
//booking class
class Booking {
    int bookingId;
    String passengerName;
    Flight flight;
    Booking(int bookingId, String passengerName, Flight flight){
        this.bookingId=bookingId;
        this.passengerName=passengerName;
        this.flight=flight;
    }
    void displayBooking(){
        System.out.println("Booking ID: "+bookingId+
            "|Passenger: "+passengerName+"|Flight: "+flight.airline+
            "(" + flight.source + "-"+flight.destination+")"+"|Price: "+flight.price);
    }
}
//service class
class FlightService{
    //array to store available flight
    private Flight[] flights;
    //list to store bookings
    private List<Booking> bookings =new ArrayList<>();
    private int bookingCounter=1;
    FlightService(){
        flights= new Flight[]{
            new Flight(1,"Delhi","Mumbai","Indigo",4500),
            new Flight(2,"Lucknow", "Bangalore","Air India",8000),
            new Flight(3, "Ayodhya","Delhi","Vistara",5000),
            new Flight(4,"Delhi","Goa","Indigo",5000)
        };
    }
    //search flights
    void searchFlights(String source,String destination){
        boolean found=false;
        System.out.println("\nAvailable Flights:");
        for (Flight f:flights){
            if (f.source.equalsIgnoreCase(source)&&f.destination.equalsIgnoreCase(destination)){
                f.displayFlight();
                found=true;
            }
        }
        if (!found){
            System.out.println("No flights found");
        }
    }
    //book flight
    void bookFlight(int flightId, String passengerName){
        for (Flight f:flights){
            if (f.flightId==flightId){
                Booking booking=new Booking(bookingCounter++,passengerName,f);
                bookings.add(booking);
                System.out.println("Flight booked successfully");
                return;
            }
        }
        System.out.println("Invalid flight ID");
    }
    //display bookings
    void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available");
            return;
        }
        System.out.println("\nYour Bookings:");
        for (Booking b:bookings){
            b.displayBooking();
        }
    }
    //cancel booking
    void cancelBooking(int bookingId){
        boolean removed=bookings.removeIf(b->b.bookingId==bookingId);
        if (removed){
            System.out.println("Booking cancelled successfully");
        }else{
            System.out.println("Booking ID not found");
        }
    }
}
//main class
public class FlightManagement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        FlightService service=new FlightService();
        while (true){
            System.out.println("\nFlight Booking System :---");
            System.out.println("1. Search Flights");
            System.out.println("2. Book Flight");
            System.out.println("3. View Bookings");
            System.out.println("4. Cancel Booking");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice=sc.nextInt();
            sc.nextLine(); //move to newline
            switch (choice){
                case 1:
                    System.out.print("Enter Source: ");
                    String src=sc.nextLine();
                    System.out.print("Enter Destination: ");
                    String dest=sc.nextLine();
                    service.searchFlights(src,dest);
                    break;
                case 2:
                    System.out.print("Enter Flight ID: ");
                    int fid=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Passenger Name: ");
                    String name=sc.nextLine();
                    service.bookFlight(fid,name);
                    break;
                case 3:
                    service.viewBookings();
                    break;
                case 4:
                    System.out.print("Enter Booking ID: ");
                    int bid =sc.nextInt();
                    service.cancelBooking(bid);
                    break;
                case 5:
                    System.out.println("Thank you");
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}