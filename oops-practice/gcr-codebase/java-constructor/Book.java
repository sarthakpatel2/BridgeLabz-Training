class Book {
    String title;
    String author;
    double price;
    //default constructor
    Book() {
        title="Unknown";
        author="Unknown";
        price=0.0;
    }
    //parameterized constructor
    Book(String title, String author, double price) {
        this.title =title;
        this.author= author;
        this.price=price;
    }
    void display() {
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: ₹"+price);
        System.out.println();
    }
    public static void main(String[] args) {
        Book b1=new Book(); // default
        Book b2=new Book("Java Programming", "James Gosling", 550);
        b1.display();
        b2.display();
    }
}
