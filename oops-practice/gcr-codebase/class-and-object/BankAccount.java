class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;
    void display() {
        System.out.println("Current balance: "+balance);
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Deposited: "+amount);
        display();
    }
    void withdraw(double amount){
        if (amount<=balance) {
            balance-=amount;
            System.out.println("Withdraw amount is : "+amount);
            display();
        } else {
            System.out.println("Insufficient balance");
        }
    }
    public static void main(String[] args) {
        BankAccount acc =new BankAccount();
        acc.accountHolder= "State of Chennai";
        acc.accountNumber= "ACC101";
        acc.balance =700.0;
        System.out.println("State of Chennai\n");
        acc.display();
        acc.deposit(200);
        acc.withdraw(100);
        acc.withdraw(1000);
    }
}
