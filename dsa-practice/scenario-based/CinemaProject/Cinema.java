package CinemaProject;
public class Cinema{
    public static void main(String[] args){
        CinemaTime cinema=new CinemaTime();
        try{
            cinema.addMovie("Inception","18:30");
            cinema.addMovie("Interstellar","21:00");
            cinema.addMovie("Avengers-End Game","25:99"); 
        } catch (InvalidTimeFormatException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nAll Movies ---");
        cinema.displayAllMovies();
        System.out.println("\nSearch Movie ---");
        cinema.searchMovie("inter");
        cinema.generateReport();
    }
}
