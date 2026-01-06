interface Reservable{
    void reserveItem();
    boolean checkAvailability();
}
abstract class LibraryItem implements Reservable{
    //encapsulation
    private int itemId;
    private String title;
    private String author;
    private boolean isAvailable=true;
    //constructor
    public LibraryItem(int itemId,String title,String author){
        this.itemId=itemId;
        this.title=title;
        this.author=author;
    }
    //abstract method
    public abstract int getLoanDuration();
    //concrete method
    public void getItemDetails(){
        System.out.println("ID: "+itemId);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Available: "+isAvailable);
        System.out.println("Loan Duration: "+getLoanDuration()+" days");
    }
    //encapsulated access
    protected void setAvailability(boolean status){
        isAvailable=status;
    }
    public void reserveItem(){
        if (isAvailable){
            isAvailable=false;
            System.out.println("Item reserved successfully");
        } else {
            System.out.println("Item is already reserved");
        }
    }
    public boolean checkAvailability(){
        return isAvailable;
    }
}
class Book extends LibraryItem{
    public Book(int itemId,String title,String author) {
        super(itemId,title,author);
    }
    public int getLoanDuration() {
        return 14; //14 days for books
    }
}
class Magazine extends LibraryItem{
    public Magazine(int itemId,String title,String author) {
        super(itemId,title,author);
    }
    public int getLoanDuration() {
        return 7; //7 days for magazines
    }
}
class DVD extends LibraryItem{
    public DVD(int itemId,String title,String author){
        super(itemId,title,author);
    }
    public int getLoanDuration(){
        return 3;//3 days for DVD
    }
}
public class LibraryManagement{
    public static void main(String[] args){
        //polymorphism
        LibraryItem item1=new Book(01,"Java ","James Gosling");
        LibraryItem item2=new Magazine(02,"Times India","Editorial ");
        LibraryItem item3=new DVD(03, "Inception","Christopher Nolan");
        item1.getItemDetails();
        System.out.println();
        item2.getItemDetails();
        System.out.println();
        item3.getItemDetails();
        System.out.println();
        //reserving an item
        item1.reserveItem();
        System.out.println("Available: "+item1.checkAvailability());
    }
}
