import java.util.*;
//book class
class Book{
    String title;
    String author;
    boolean isAvailable;
    Book(String title, String author, boolean isAvailable){
        this.title=title;
        this.author= author;
        this.isAvailable=isAvailable;
    }
}
//library class
class Library{
    //store book data in an Array
    static Book[] bookArray={
        new Book("Java ","James Gosling",true),
        new Book("Godaan","Premchand",true),
        new Book("Gaban", "Premchand",false),
        new Book("Physics","H.C Verma",true)
    };
    //store books in  List
    static List<Book> bookList = Arrays.asList(bookArray);
    //display all books
    static void displayBooks(){
        System.out.println("\nAvailable Books:");
        for (Book book:bookList){
            System.out.println("Title: "+book.title+", Author: "+book.author+", Status: "+(book.isAvailable?"Available":"Checked Out"));
        }
    }
    //search book by title
    static void searchBook(String keyword){
        System.out.println("\nSearch Results:");
        boolean found=false;
        for (Book book:bookList){
            if(book.title.toLowerCase().contains(keyword.toLowerCase())){
                System.out.println("Title: "+book.title+", Author: "+book.author+", Status: "+(book.isAvailable?"Available":"Checked Out"));
                found=true;
            }
        }
        if(!found){
            System.out.println("No books found with title : "+keyword);
        }
    }
    //chhckout book
    static void checkoutBook(String title) throws BookNotAvailableException{
        for (Book book:bookList){
            if (book.title.equalsIgnoreCase(title)){
                if (!book.isAvailable){
                    throw new BookNotAvailableException("Book already checked ouy");
                }
                book.isAvailable=false;
                System.out.println("Book checked out successfully: "+book.title);
                return;
            }
        }
        System.out.println("Book not found");
    }
}
//main class
public class BookSearch{
    public static void main(String[] args){
        Library.displayBooks();
        Library.searchBook("Java");
        try{
            Library.checkoutBook("Gaban");
        } catch (BookNotAvailableException e){
            System.out.println("Exception: "+e.getMessage());
        }
        try {
            Library.checkoutBook("Physics");
        } catch (BookNotAvailableException e){
            System.out.println("Exception: "+e.getMessage());
        }
        Library.displayBooks();
    }
}
//custom Exception
class BookNotAvailableException extends Exception{
    public BookNotAvailableException(String message){
        super(message);
    }
}
