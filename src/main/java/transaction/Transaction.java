package transaction;

import account.Account;

import java.math.BigDecimal;

public class Transaction {

    private final String title;
    private final Account counterparty;
    private final BigDecimal value;

    public Transaction(String title, Account counterparty, BigDecimal value) {
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

    public BigDecimal getValue() {
        return value;
    }
}
