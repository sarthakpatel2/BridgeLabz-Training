package bookshelf;
import java.util.*;
public class BookShelf {
    private Map<String, LinkedList<Book>> catalog;
    private Set<String> bookSet;
    BookShelf() {
        catalog = new HashMap<>();
        bookSet = new HashSet<>();
    }
    public void addBook(String genre, Book book) {
        if (bookSet.contains(book.title)) {
            System.out.println("Duplicate book not allowed: " +book.title);
            return;
        }
        catalog.putIfAbsent(genre, new LinkedList<>());
        catalog.get(genre).add(book);
        bookSet.add(book.title);
        System.out.println("Added: " + book+ " to " +genre);
    }
    public void removeBook(String genre, String title) {
        LinkedList<Book> books = catalog.get(genre);
        if (books == null || books.isEmpty()) {
            System.out.println("No books available in genre: " + genre);
            return;
        }
        Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.title.equals(title)) {
                it.remove();
                bookSet.remove(title);
                System.out.println("Borrowed: " + b);
                return;
            }
        }
        System.out.println("Book not found: " +title);
    }
    public void printCatalog() {
        if (catalog.isEmpty()) {
            System.out.println("Library is empty");
            return;
        }

        for (String genre : catalog.keySet()) {
            System.out.println("Genre: " + genre);
            for (Book book : catalog.get(genre)) {
                System.out.println("  - "+book);
            }
        }
    }
}
