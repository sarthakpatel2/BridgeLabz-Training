package bookshelf;
public class Main {
    public static void main(String[] args) {
        BookShelf shelf = new BookShelf();
        shelf.addBook("Fiction", new Book("1984", "George Orwell"));
        shelf.addBook("Fiction", new Book("Animal Farm", "George Orwell"));
        shelf.addBook("Science", new Book("Brief History of Time", "Stephen Hawking"));

        shelf.printCatalog();

        shelf.removeBook("Fiction", "1984");
        shelf.printCatalog();

        shelf.addBook("Fiction", new Book("1984", "George Orwell"));
    }
}
