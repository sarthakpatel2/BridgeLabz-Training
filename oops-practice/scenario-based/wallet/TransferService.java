package wallet;

public interface TransferService {
    void transfer(User fromUser, User toUser, double amount)
            throws InsufficientBalanceException;
}
