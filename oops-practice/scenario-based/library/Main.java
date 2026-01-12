package library;
public class Main{
    public static void main(String[] args) {
        LibraryService service = new LibraryServiceImpl();
        Book b1 = new Book(101, "Physics");
        Book b2 = new Book(102, "Computer");
        Member student = new StudentMember(1, "Sarthak");
        Member staff = new StaffMember(2, "Dr. Kumar");
        service.addBook(b1);
        service.addBook(b2);
        service.registerMember(student);
        service.registerMember(staff);
        try {
            service.issueBook(b1);
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        }
        Transaction t1 = new Transaction(b1, student, 5);
        service.returnBook(t1);
    }
}
