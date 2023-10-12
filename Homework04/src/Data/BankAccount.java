package Data;
public class BankAccount {
    private long cardNumber;
    private double balance;

    public BankAccount(long cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    public long getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
