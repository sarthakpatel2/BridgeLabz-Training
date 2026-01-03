class BankAccount {
    int accountNumber;
    double balance;
    BankAccount(int accountNumber, double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    void displayDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}
//savings Account
class SavingsAccount extends BankAccount{
    double interestRate;
    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate=interestRate;
    }
    @Override
    void displayDetails() {
        System.out.println("Account Type: Savings Account");
        super.displayDetails();
        System.out.println("Interest Rate: "+interestRate+ "%");
    }
}
//checking Account
class CheckingAccount extends BankAccount{
    double withdrawalLimit;
    CheckingAccount(int accountNumber,double balance,double withdrawalLimit) {
        super(accountNumber, balance);
        //initialize properties of subclass
        this.withdrawalLimit=withdrawalLimit;
    }
    @Override
    void displayDetails(){
        System.out.println("Account Type: Checking Account");
        super.displayDetails();
        System.out.println("Withdrawal Limit: "+withdrawalLimit);
    }
}
//fixed Deposit Account
class FixedDepositAccount extends BankAccount{
    int maturityPeriod;
    FixedDepositAccount(int accountNumber,double balance,int maturityPeriod){
        //constructorcall of parent class
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }
    @Override
    void displayDetails(){
        System.out.println("Account Type: Fixed Deposit Account");
        super.displayDetails();
        System.out.println("Maturity Period: "+maturityPeriod+" months");
    }
}
//main class
public class BankSystem{
    public static void main(String[] args){
        BankAccount[] accounts={new SavingsAccount(101, 50000, 4.5),new CheckingAccount(102, 30000, 20000),};
        for (BankAccount acc:accounts) {
            acc.displayDetails();
            System.out.println();
        }
    }
}
