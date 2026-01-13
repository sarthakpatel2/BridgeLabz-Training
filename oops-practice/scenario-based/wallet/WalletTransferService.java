package wallet;

public class WalletTransferService implements TransferService {
    @Override
    public void transfer(User fromUser, User toUser, double amount)
            throws InsufficientBalanceException {
        fromUser.getWallet().withdrawMoney(amount);
        toUser.getWallet().addMoney(amount);
        fromUser.addTransaction(
                new Transaction("Wallet Transfer Sent", amount));
        toUser.addTransaction(
                new Transaction("Wallet Transfer Received", amount));

        System.out.println("Wallet transfer successful");
    }
}
