class BankAccount{
    // access modifiers
    public int accountNumber;
    protected String accountHolder;
    private double balance;
    // constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber= accountNumber;
        this.accountHolder =accountHolder;
        this.balance =balance;
    }
    //public getter for balance
    public double getBalance(){
        return balance;
    }
    //public setter for balance (deposit)
    public void depositAmount(double amount){
        if (amount >0) {
            balance+= amount;
        }
    }
    // Public method to withdraw money
    public void withdrawAmount(double amount){
        if (amount >0&& amount<=balance) {
            balance-= amount;
        }
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate){
        // calling parent constructor
        super(accountNumber, accountHolder, balance);
        // initializing subclass variable
        this.interestRate =interestRate;
    }
    void displayDetails(){
        System.out.println("Account Number: "+accountNumber);// public
        System.out.println("Account Holder: "+accountHolder);// protected
        System.out.println("Balance: ₹"+getBalance());// private via method
        System.out.println("Interest Rate: "+interestRate+"%");
        System.out.println();
    }
    public static void main(String[] args) {
        SavingsAccount sa=new SavingsAccount(12345, "Sarthak Patel", 79308,4.5);
        sa.displayDetails();
        sa.depositAmount(2000);
        sa.withdrawAmount(1500);
        System.out.println("Updated Balance: ₹"+sa.getBalance());
    }
}

