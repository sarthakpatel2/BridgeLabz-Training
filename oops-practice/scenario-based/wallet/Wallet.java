package wallet;
public class Wallet {
    private double balance;
    public Wallet() {
        balance =0.0;
    }
    public double getBalance() {
        return balance;
    }
    public void addMoney(double amount) {
        balance += amount;
    }
    public void withdrawMoney(double amount)
            throws InsufficientBalanceException {
        if (amount >balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance -=amount;
    }
}
