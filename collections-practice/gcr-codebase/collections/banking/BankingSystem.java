package banking;
import java.util.*;
public class BankingSystem{
    private Map<Integer, Double> accountMap=new HashMap<>();
    // withdrawal requests
    private Queue<WithdrawalRequest> withdrawalQueue =new LinkedList<>();
    // Add account
    public void addAccount(int accountNumber, double balance) {
        accountMap.put(accountNumber, balance);
    }
    // enqueue withdrawal request
    public void requestWithdrawal(int accountNumber, double amount) {
        withdrawalQueue.offer(new WithdrawalRequest(accountNumber, amount));
    }
    // Process withdrawal requests
    public void processWithdrawals(){
        System.out.println("Processing Withdrawals:");
        while (!withdrawalQueue.isEmpty()) {
            WithdrawalRequest request=withdrawalQueue.poll();
            double balance=accountMap.getOrDefault(request.accountNumber, 0.0);
            if (balance >= request.amount){
                accountMap.put(request.accountNumber, balance -request.amount);
                System.out.println("Withdrawal successful :- Account: "+request.accountNumber+", Amount: "+ request.amount);
            } else{
                System.out.println("Insufficient balance :- Account: "+request.accountNumber);
            }
        }
    }
    // Display accounts
    public void displayAccounts(){
        System.out.println("\nAccounts (Unsorted):");
        for (Map.Entry<Integer, Double> entry : accountMap.entrySet()){
            System.out.println("Account " +entry.getKey() + " - "+ entry.getValue());
        }
    }
    // Display accounts sorted by balance
    public void displayAccountsSortedByBalance(){
        System.out.println("\nAccounts Sorted by Balance:");
        // list of Account Numbers
        TreeMap<Double, List<Integer>> sortedMap = new TreeMap<>();
        for (Map.Entry<Integer, Double> entry : accountMap.entrySet()) {
            sortedMap.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }
        for (Map.Entry<Double, List<Integer>> entry : sortedMap.entrySet()) {
            for (int accNo : entry.getValue()) {
                System.out.println("Account "+accNo + " - "+ entry.getKey());
            }
        }
    }
    // inner class for withdrawal request
    private static class WithdrawalRequest{
        int accountNumber;
        double amount;
        WithdrawalRequest(int accountNumber, double amount) {
            this.accountNumber=accountNumber;
            this.amount =amount;
        }
    }
}
