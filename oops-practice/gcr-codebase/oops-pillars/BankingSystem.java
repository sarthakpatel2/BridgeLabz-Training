interface Loanable {
    void applyForLoan();
    double calculateLoanEligibility();
}
//abstract class
abstract class BankAccount{
    private String accountNumber;
    private String holderName;
    protected double balance;
    public BankAccount(String accNo, String name,double balance){
        this.accountNumber=accNo;
        this.holderName=name;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if (amount<=balance)
            balance-=amount;
        else
            System.out.println("Insufficient Balance");
    }
    public String getAccountNumber(){
        return "XXXX"+accountNumber.substring(4);
    }
    abstract double calculateInterest();
}
//savings Account
class SavingsAccount extends BankAccount implements Loanable{
    public SavingsAccount(String accNo,String name, double bal){
        super(accNo, name, bal);
    }
    public double calculateInterest(){
        return balance*0.04;
    }
    public void applyForLoan() {
        System.out.println("Savings Account Loan Applied");
    }
    public double calculateLoanEligibility(){
        return balance*5;
    }
}
//current Account
class CurrentAccount extends BankAccount implements Loanable{
    public CurrentAccount(String accNo,String name,double bal){
        super(accNo,name,bal);
    }
    public double calculateInterest(){
        return balance*0.02;
    }
    public void applyForLoan() {
        System.out.println("Current Account Loan Applied");
    }
    public double calculateLoanEligibility(){
        return balance*3;
    }
}
//Main class
public class BankingSystem{
    public static void main(String[] args){
        BankAccount[] accounts=new BankAccount[2];
        accounts[0]=(new SavingsAccount("12345678","Shivam",50000));
        accounts[1]=(new CurrentAccount("87654321","Madhav",100000));
        for (BankAccount acc:accounts){
            Loanable loan=(Loanable) acc;
            System.out.println("Account No: "+acc.getAccountNumber());
            System.out.println("Interest: "+acc.calculateInterest());
            loan.applyForLoan();
            System.out.println("Loan Eligibility: "+loan.calculateLoanEligibility());
            System.out.println();
        }
    }
}
