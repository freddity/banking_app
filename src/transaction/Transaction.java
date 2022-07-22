package transaction;

import user.Account;

public class Transaction {

    private final String title;
    private final Account counterparty;
    private final float value;

    public Transaction(String title, Account counterparty, float value) {
        this.title = title;
        this.counterparty = counterparty;
        this.value = value;
    }

    public String getTitle() {
        return title;
    }

    public Account getCounterparty() {
        return counterparty;
    }

    public float getValue() {
        return value;
    }
}
