class LibraryBook{
    String title;
    String author;
    double price;
    boolean available;
    //parameterized constructor
    LibraryBook(String title, String author, double price) {
        this.title=title;
        this.author=author;
        this.price=price;
        this.available=true;
    }
    void borrowBook(){
        if(available){
            available=false;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book is already borrowed");
        }
    }
    void display() {
        System.out.println(title+" by " +author+ " | Price: "+price+" | Available: "+available);
    }
    public static void main(String[] args) {
        LibraryBook b=new LibraryBook("Java Basics", "James Gosling", 500);
        b.display();
        b.borrowBook();
        b.borrowBook();
    }
}
