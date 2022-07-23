package account;

import transaction.Transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Account {

    private final String number;
    private final List<Transaction> transactions = new ArrayList<>();

    public Account(String number) {
        this.number = number;
    }

    public BigDecimal defineBalance() {
        BigDecimal balance = new BigDecimal("0");
        for (Transaction t : transactions) {
            balance = balance.add(t.getValue());
        }

        return balance;
    }

    public void addTransaction(Transaction t) {
        transactions.add(t);
    }

    public String getNumber() {
        return number;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public Transaction getTransaction(String id) {
        for (Transaction t : transactions) {
            if (t.getId().equals(id)) {
                return t;
            }
        }
        return null;
    }
}
