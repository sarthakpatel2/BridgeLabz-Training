package bankingaccount;
public class CheckingAccount extends BankAccount{
    public CheckingAccount(String holderName, int accNumber, double balance) {
        super(holderName, accNumber, balance);
    }
    @Override
    public double calculateFee() {
        if (getBalance() < 1000) {
            return 1.0;
        }
        return 0.0;
    }
}
