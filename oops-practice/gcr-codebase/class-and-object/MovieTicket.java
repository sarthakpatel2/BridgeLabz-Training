class MovieTicket{
    String movieName;
    String seatNumber;
    double price;
    boolean booked=false;
    void bookTicket(String movie, String seat, double amount) {
        if (!booked){
            movieName= movie;
            seatNumber= seat;
            price=amount;
            booked=true;
            System.out.println("Ticket booked for movie: "+movieName);
            System.out.println("Seat Number: "+seatNumber);
        } else {
            System.out.println("House full. Ticket already booked");
        }
    }
    void display() {
        if (!booked) {
            System.out.println("Ticket have not booked yet");
        } else {
            System.out.println("Price: $"+price);
        }
        System.out.println();
    }
    public static void main(String[] args){
        MovieTicket ticket = new MovieTicket();
        ticket.display();
        ticket.bookTicket("Dragon", "A10",120);
        ticket.bookTicket("Dragon","A10",120);
        ticket.bookTicket("Dragon","A10", 120);
        ticket.display();
        System.out.println("Ticket booked for movie: Dragon");
        System.out.println("Seat Number: A10");
        System.out.println("Price: $120.0");
    }
}
