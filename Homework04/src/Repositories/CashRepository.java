package Repositories;
import java.util.ArrayList;
import java.util.List;

import Data.BankAccount;

public class CashRepository {
    private List<BankAccount> accounts;

    public CashRepository() {
        this.accounts = new ArrayList<>();
    }

    public BankAccount getAccount(long cardNumber) {
        for (BankAccount account : this.accounts) {
            if (account.getCardNumber() == cardNumber) {
                return account;
            }
        }
        return null;
    }

    public void setAccount(BankAccount account) {
        this.accounts.add(account);
    }

    public void deleteAccount(long cardNumber) {
        for (int i = 0; i < this.accounts.size(); i++) {
            if (this.accounts.get(i).getCardNumber() == cardNumber) {
                this.accounts.remove(i);
                break;
            }
        }
    }

    public List<BankAccount> getAccounts() {
        return this.accounts;
    }
}
