import java.time.LocalTime;
class BankAccount{
    private int balance=10000;
    public int getBalance() {
        return balance;
    }
    //not synchronized 
    public boolean withdraw(int amount) {
        if (balance >=amount){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {}
            balance -=amount;
            return true;
        }
        return false;
    }
}
class Transaction implements Runnable{
    private BankAccount account;
    private String customer;
    private int amount;

    public Transaction(BankAccount account, String customer, int amount) {
        this.account =account;
        this.customer=customer;
        this.amount=amount;
    }
    @Override
    public void run() {
        System.out.println("["+Thread.currentThread().getName()+ "] Attempting to withdraw " +amount);
        boolean success= account.withdraw(amount);
        if (success){
            System.out.println("Transaction successful: "+customer+", Amount: "+amount+
                ", Balance: " + account.getBalance()+", Time: " +LocalTime.now());
        } else {
            System.out.println("Transaction failed: "+customer+", Insufficient balance");
        }
    }
}
public class BankingSystem{
    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        int[] amounts={3000, 4000, 2000, 5000, 1500};
        for (int i =0;i<amounts.length;i++){
            Thread t=new Thread(
                new Transaction(account, "Customer-"+(i+1), amounts[i]),"Customer-"+(i+1));
            System.out.println(t.getName()+" state: "+t.getState());
            t.start();
        }
    }
}
