package wallet;
import java.util.*;
public class User {
    private int userId;
    private String name;
    private Wallet wallet;
    private List<Transaction> transactions;
    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
        this.wallet = new Wallet();
        this.transactions = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public Wallet getWallet() {
        return wallet;
    }
    public void addTransaction(Transaction t) {
        transactions.add(t);
    }
    public void showTransactions() {
        System.out.println("\nTransaction History of " + name);
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
