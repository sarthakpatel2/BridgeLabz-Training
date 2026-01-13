package wallet;
public class Main {
    public static void main(String[] args){
        User u1 = new User(1, "Sarthak");
        User u2 = new User(2, "Sanjh");
        u1.getWallet().addMoney(5000);
        TransferService walletTransfer = new WalletTransferService();
        TransferService bankTransfer =new BankTransferService();
        try {
            walletTransfer.transfer(u1, u2,1000);
            bankTransfer.transfer(u1, u2,2000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " +e.getMessage());
        }
        System.out.println("\nFinal Balances:");
        System.out.println("Sarthak: "+u1.getWallet().getBalance());
        System.out.println("Sanjh: " +u2.getWallet().getBalance());
        u1.showTransactions();
        u2.showTransactions();
    }
}
