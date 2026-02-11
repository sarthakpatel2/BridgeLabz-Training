package junit.Program;
public class Program {

    private double balance;

    public Program(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void Deposit(double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Deposit amount cannot be negative");
        }
        balance += amount;
    }

    public void Withdraw(double amount) throws Exception {
        if (amount > balance) {
            throw new Exception("Insufficient funds.");
        }
        balance -= amount;
    }
}