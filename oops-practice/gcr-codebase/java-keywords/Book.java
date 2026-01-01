class Book{
    //static variable
    static String libraryName="CID Library";
    //instance variables
    String title;
    String author;
    //final variable
    final String isbn;
    //constructor
    Book(String title, String author,String isbn){
        this.title= title;
        this.author= author;
        this.isbn=isbn;
    }
    //static method
    static void displayLibrary(){
        System.out.println("Library Name: "+libraryName);
    }
    //display details using instanceof
    static void displayBookDetail(Object obj) {
        if (obj instanceof Book){
            Book b=(Book) obj;
            System.out.println("Title: " +b.title);
            System.out.println("Author: "+b.author);
            System.out.println("ISBN: "+b.isbn);
        }else{
            System.out.println("Object not a Book");
        }
    }
    public static void main(String[] args){
        Book book =new Book("CID","ACP Pradyuman","978991");
        displayLibrary();
        displayBookDetail(book);
    }
}
