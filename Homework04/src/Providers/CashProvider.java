package Providers;
import Data.BankAccount;
import Repositories.CashRepository;

public class CashProvider {
    CashRepository cashRepository;

    public CashProvider() {
        this.cashRepository = new CashRepository();
    }

    public void createAccount(long cardNumber, double balance) {
        BankAccount account = new BankAccount(cardNumber, balance);
        this.cashRepository.setAccount(account);
    }

    public void updateAccount(long cardNumber, double balance) {
        for (BankAccount account : this.cashRepository.getAccounts()) {
            if (account.getCardNumber() == cardNumber) {
                account.setBalance(balance);
                break;
            }
        }
    }

    public void deleteAccount(long cardNumber) {
        this.cashRepository.deleteAccount(cardNumber);
    }

    public BankAccount readAccount(long cardNumber) {
        return this.cashRepository.getAccount(cardNumber);
    }
}
