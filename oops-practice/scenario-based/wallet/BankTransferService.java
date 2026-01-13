package wallet;

public class BankTransferService implements TransferService {
    @Override
    public void transfer(User fromUser, User toUser, double amount)
            throws InsufficientBalanceException {
        fromUser.getWallet().withdrawMoney(amount);
        //simulating bank transfer
        toUser.getWallet().addMoney(amount);

        fromUser.addTransaction(
                new Transaction("Bank Transfer Sent", amount));
        toUser.addTransaction(
                new Transaction("Bank Transfer Received", amount));
        System.out.println("Bank transfer successful");
    }
}
