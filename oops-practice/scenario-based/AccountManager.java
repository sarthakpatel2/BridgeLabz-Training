class AccountManager{
    int accountNumber;
    double balance;
    //constructor
    AccountManager(int accountNumber,double balance){
        this.accountNumber =accountNumber;
        this.balance=balance;
    }
    //deposit method
    void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("Deposited: "+amount);
        }else{
            System.out.println("Invalid deposit amount");
        }
    }
    //withdraw method (prevents overdraft)
    void withdraw(double amount){
        if (amount>balance){
            System.out.println("Insufficient balance ");
        } else if (amount>0) {
            balance-=amount;
            System.out.println("Withdrawn: "+amount);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
    //check balance method
    void checkBalance(){
        System.out.println("Current Balance: "+balance);
    }
    // main method for testing
    public static void main(String[] args){
        AccountManager account= new AccountManager(01,5000);
        account.checkBalance();
        account.deposit(2000);
        account.withdraw(3000);
        account.withdraw(6000); //overdraft attempt
        account.checkBalance();
    }
}
