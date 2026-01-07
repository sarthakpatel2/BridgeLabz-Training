package banking;
public class Main{
  public static void main(String[] args){
    System.out.println("ONLINE BANKING SYSTEM :-----\n");
    // Account creation
    SavingAccount sA = new SavingAccount(1001001L, "Sarthak", 5000);
    CurrentAccount cA = new CurrentAccount(2002002L, "Sanjh", 3000);
    // Balance check
    sA.displayAccountDetails();
    cA.displayAccountDetails();
    // Add money
    System.out.println("Adding Money ----");
    sA.addMoney(2000);
    cA.addMoney(1500);
    // Withdraw money
    System.out.println("\nWithdrawing Money ----");
    sA.withdrawMoney(1000);
    cA.withdrawMoney(500);
    // Fund transfer
    System.out.println("\nFund Transfer ----");
    int transferAmount = 1500;

    if (sA.getBalance() >= transferAmount) {
      sA.withdrawMoney(transferAmount);
      cA.addMoney(transferAmount);
      System.out.println("Transfer Successful");
    } else {
      System.out.println("Transfer Failed: Insufficient Balance");
    }
    // Final status
    System.out.println("\nFinal Account Status ----");
    sA.displayAccountDetails();
    cA.displayAccountDetails();

    System.out.println(" TRANSACTION COMPLETED ----");
  }
}