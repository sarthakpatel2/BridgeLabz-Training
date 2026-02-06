import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
public class LibraryBook{
    static class Book{
        private String title;
        private String genre;
        private int pages;
        public Book(String title, String genre, int pages) {
            this.title=title;
            this.genre=genre;
            this.pages=pages;
        }
        public String getGenre(){
            return genre;
        }
        public int getPages(){
            return pages;
        }
    }
    public static void main(String[] args){
        List<Book> books=Arrays.asList(
            new Book("Harry Potter", "Fiction",3000),
            new Book("Game Of Thrones", "Fiction",1200),
            new Book("Cosmos", "Science", 500),
            new Book("The Origin of Species", "Science", 650),
            new Book("Guns, Germs, and Steel", "History", 700)
        );
        Map<String, IntSummaryStatistics> statsByGenre=books.stream().collect(Collectors.groupingBy(
                     Book::getGenre,Collectors.summarizingInt(Book::getPages)
                 ));
        statsByGenre.forEach((genre, stats)->{
            System.out.println("Genre: "+genre);
            System.out.println("  Total Pages: "+stats.getSum());
            System.out.println("  Average Pages: "+stats.getAverage());
            System.out.println("  Maximum Pages: "+stats.getMax());
        });
    }
}
