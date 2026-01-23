package banking;
public class Main{
    public static void main(String[] args){
        BankingSystem bank =new BankingSystem();
        // Add accounts
        bank.addAccount(01,50000);
        bank.addAccount(02,30000);
        bank.addAccount(03, 70000);
        bank.addAccount(04,30000);
        bank.displayAccounts();
        // Withdrawal requests
        bank.requestWithdrawal(01,10000);
        bank.requestWithdrawal(02,35000);
        bank.requestWithdrawal(03,20000);
        bank.processWithdrawals();
        bank.displayAccounts();
        bank.displayAccountsSortedByBalance();
    }
}
