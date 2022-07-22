package user;

import transaction.Transaction;

import java.util.List;

public class Account {

    private final String number;
    private List<Transaction> transactions;

    public Account(String number) {
        this.number = number;
    }

    public float defineBalance() {
        float balance = 0;
        for (Transaction t : transactions) {
            balance += t.getValue();
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
}
