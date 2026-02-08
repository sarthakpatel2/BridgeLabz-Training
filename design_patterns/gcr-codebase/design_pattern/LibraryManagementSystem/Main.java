package LibraryManagementSystem;
public class Main {
    public static void main(String[] args){
        //singleton
        LibraryCatalog catalog =LibraryCatalog.getInstance();
        //builder
        Book book=new Book.BookBuilder("We were never meant to be")
                .addAuthor("Ritvik").edition("1st Edition")
                .genre("Romance").publisher("Corolado").build();
        catalog.addBook(book);
        //factory
        User u1 =UserFactory.createUser("student", "Sarthak");
        User u2=UserFactory.createUser("faculty", "Sanjh");
        u1.getRole();
        u2.getRole();
        //observer
        NotificationService notificationService = new NotificationService();
        LibraryUser user1 =new LibraryUser("Sarthak");
        LibraryUser user2=new LibraryUser("Sanjh");
        notificationService.subscribe(user1);
        notificationService.subscribe(user2);
        notificationService.notifyUsers("Book available: We were never meant to be ");
    }
}
