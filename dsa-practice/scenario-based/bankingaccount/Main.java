package bankingaccount;
public class Main{
	public static void main(String[] args) {
        BankAccount saving1 = new SavingAccount("abc", 123, 500);
        System.out.printf("%.2f%n", saving1.calculateFee()); 
        BankAccount checking1 = new CheckingAccount("abc", 124, 1500);
        System.out.printf("%.2f%n", checking1.calculateFee());
        BankAccount checking2 = new CheckingAccount("abc", 125, 500);
        System.out.printf("%.2f%n", checking2.calculateFee()); 
    }

}
