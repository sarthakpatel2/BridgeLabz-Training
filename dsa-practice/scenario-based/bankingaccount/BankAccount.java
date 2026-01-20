package bankingaccount;
public abstract class BankAccount {
    private final int accNumber;
    private final String holderName;
    private final double balance;

    public BankAccount(String holderName, int accNumber, double balance) {
        this.holderName = holderName;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double calculateFee();

    public void displayDetails() {
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}
