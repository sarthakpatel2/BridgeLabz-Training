class BookLibrary{
    //access modifiers
    public String ISBN;
    protected String title;
    private String author;
    // constructor
    BookLibrary(String ISBN, String title, String author) {
        this.ISBN =ISBN;
        this.title=title;
        this.author=author;
    }
    //setter for author
    public void setAuthor(String author){
        this.author=author;
    }
    //getter for author
    public String getAuthor() {
        return author;
    }
}
class EBook extends BookLibrary{
    double fileSize;
    EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize=fileSize;
    }
    void display(){
        System.out.println("ISBN: "+ISBN);// public
        System.out.println("Title: "+title); // protected
        System.out.println("Author: "+getAuthor());//private via getter
        System.out.println("File Size: "+fileSize+" MB");
        System.out.println();
    }
    public static void main(String[] args) {
        EBook eb=new EBook("978-0135166307", "Godaan", "Munshi Premchand", 5.2);
        eb.display();
        eb.setAuthor("M. Premchand");
        System.out.println("Updated Author: "+eb.getAuthor());
    }
}
