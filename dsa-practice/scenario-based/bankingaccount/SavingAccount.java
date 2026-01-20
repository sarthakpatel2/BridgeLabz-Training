package bankingaccount;
public class SavingAccount extends BankAccount {
    public SavingAccount(String holderName, int accNumber, double balance) {
        super(holderName, accNumber, balance);
    }
    @Override
    public double calculateFee() {
        return getBalance() * 0.005; 
    }
}
