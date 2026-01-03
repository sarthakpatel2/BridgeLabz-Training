class Book{
    String title;
    int publicationYear;
    //constructor of parent
    Book(String title, int publicationYear){
        //initialize properties
        this.title=title;
        this.publicationYear=publicationYear;
    }
    void displayInfo(){
        System.out.println("Book Title: "+title);
        System.out.println("Publication Year: "+publicationYear);
    }
}
//subclass
class Author extends Book{
    String name;
    String bio;
    //constuctor of subclass Author
    Author(String title, int publicationYear,String name,String bio){
        //call the parent constructor
        super(title, publicationYear);
        this.name=name;
        this.bio=bio;
    }
    @Override
    void displayInfo(){
        //call patent method
        super.displayInfo();
        System.out.println("Author Name: "+name);
        System.out.println("Author Bio: "+bio);
    }
}
// main class
public class BookAndAuthor{
    public static void main(String[] args) {
        Author book1 =new Author("We were never meant to be",2022,"Sarthak","A passionate writer and novelist");
        book1.displayInfo();
    }
}
