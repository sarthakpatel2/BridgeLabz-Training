import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
class Movie{
    private String name;
    private double rating;
    private int releaseYear;
    public Movie(String name, double rating, int releaseYear){
        this.name=name;
        this.rating= rating;
        this.releaseYear= releaseYear;
    }
    public String getName(){
        return name;
    }
    public double getRating() {
        return rating;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    @Override
    public String toString() {
        return name+" | Rating: "+rating+" | Year: "+releaseYear;
    }
}
public class TopTrendingMovies{
    public static void main(String[] args){
        //movie list 
        List<Movie> movies=Arrays.asList(
            new Movie("Inception", 8.8, 2010),
            new Movie("Interstellar", 8.6, 2014),
            new Movie("Avengers: Endgame", 8.4, 2019),
            new Movie("Oppenheimer", 8.9, 2023),
            new Movie("The Dark Knight", 9.0, 2008),
            new Movie("Tenet", 7.5, 2020),
            new Movie("Dune", 8.2, 2021),
            new Movie("Joker", 8.5, 2019)
        );
        //stream API pipeline
        List<Movie> top5TrendingMovies=movies.stream()
            .filter(m ->m.getRating()>=8.0) //to filter good-rated movies
            .sorted(Comparator.comparing(Movie::getRating).reversed()
            .thenComparing(Movie::getReleaseYear).reversed())
            .limit(5) //to limit top 5 movies
            .collect(Collectors.toList());
        //output
        System.out.println("Top 5 Trending Movies:");
        top5TrendingMovies.forEach(System.out::println);
    }
}
