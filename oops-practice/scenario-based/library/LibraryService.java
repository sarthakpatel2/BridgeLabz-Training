package library;

public interface LibraryService {

    void addBook(Book book);

    void registerMember(Member member);

    void issueBook(Book book) throws BookNotAvailableException;

    void returnBook(Transaction transaction);
}
