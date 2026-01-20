package CinemaProject;
import java.util.*;
public class CinemaTime{
    private List<String> movieTitles;
    private List<String> showTimes;
    public CinemaTime(){
        movieTitles=new ArrayList<>();
        showTimes=new ArrayList<>();
    }
    // method to add movie
    public void addMovie(String title, String time)
            throws InvalidTimeFormatException {

        if (!isValidTime(time)) {
            throw new InvalidTimeFormatException(
                "Invalid time format: " + time
            );
        }
        movieTitles.add(title);
        showTimes.add(time);
    }
    // search movie using keyword
    public void searchMovie(String keyword) {
        boolean found=false;
        for (int i =0;i<movieTitles.size(); i++){
            if (movieTitles.get(i).toLowerCase().contains(keyword.toLowerCase())){
                System.out.println("Found: "+movieTitles.get(i)+" at " +showTimes.get(i));
                found =true;
            }
        }
        if (!found){
            System.out.println("No movie found with keyword: "+keyword);
        }
    }
    // display all movies
    public void displayAllMovies(){
        if (movieTitles.isEmpty()){
            System.out.println("No movies scheduled");
            return;
        }
        for (int i =0;i< movieTitles.size(); i++) {
            System.out.println((i +1)+". "+movieTitles.get(i) +" - "+showTimes.get(i));
        }
    }
    // generate printable report
    public void generateReport(){
        String[] titlesArray=movieTitles.toArray(new String[0]);
        String[] timesArray =showTimes.toArray(new String[0]);
        System.out.println("\nPrintable Movie Report ---");
        for (int i = 0; i < titlesArray.length; i++) {
            System.out.println(titlesArray[i]+" | Show Time: " +timesArray[i]);
        }
    }
    // time validation
    private boolean isValidTime(String time){
        try{
            String[] parts=time.split(":");
            if (parts.length !=2) return false;
            int hour=Integer.parseInt(parts[0]);
            int minute=Integer.parseInt(parts[1]);
            return hour >=0 && hour<=23 && minute >=0 && minute<=59;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
