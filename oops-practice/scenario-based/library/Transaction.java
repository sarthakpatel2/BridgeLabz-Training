package library;

public class Transaction {
    private Book book;
    private Member member;
    private int lateDays;

    public Transaction(Book book, Member member, int lateDays) {
        this.book = book;
        this.member = member;
        this.lateDays = lateDays;
    }

    public double calculateFine() {
        return member.calculateFine(lateDays);
    }
}
