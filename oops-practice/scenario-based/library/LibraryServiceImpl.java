package library;

import java.util.*;

public class LibraryServiceImpl implements LibraryService {

    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    @Override
    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Member registered: " + member.name);
    }

    @Override
    public void issueBook(Book book) throws BookNotAvailableException {
        if (!book.isAvailable()) {
            throw new BookNotAvailableException("Book already issued");
        }
        book.issue();
        System.out.println("Book issued: " + book.getTitle());
    }

    @Override
    public void returnBook(Transaction transaction) {
        transaction.calculateFine();
        transaction.book.returned();
        System.out.println("Book returned");
        System.out.println("Late Fine: ₹" + transaction.calculateFine());
    }
}
