package account;

import org.junit.jupiter.api.Test;
import transaction.Transaction;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void defineBalance() {
        Account account = new Account("0");

        Account counterparty = new Account("1");

        Transaction t1 = new Transaction(UUID.randomUUID().toString(), "t1", counterparty, new BigDecimal("1050"));
        Transaction t2 = new Transaction(UUID.randomUUID().toString(), "t2", counterparty, new BigDecimal("-550.99"));
        Transaction t3 = new Transaction(UUID.randomUUID().toString(), "t3", counterparty, new BigDecimal("-25.50"));

        account.addTransaction(t1);
        account.addTransaction(t2);
        account.addTransaction(t3);

        assertEquals(new BigDecimal("473.51"), account.defineBalance()); // defineBalance()
    }

    @Test
    void addTransaction() {
        Account account = new Account("0");
        Account counterparty = new Account("1");

        Transaction t = new Transaction(UUID.randomUUID().toString(), "t", counterparty, new BigDecimal("1050"));

        account.addTransaction(t); // addTransaction()

        assertEquals(t, account.getTransaction(t.getId()));
    }

    @Test
    void getNumber() {
        Account account = new Account("0");

        assertEquals("0", account.getNumber()); // getNumber()
    }

    @Test
    void getTransactions() {
        Account account = new Account("0");
        Account counterparty = new Account("1");

        Transaction t = new Transaction(UUID.randomUUID().toString(), "t", counterparty, new BigDecimal("1050"));

        account.addTransaction(t);

        assertEquals(t, account.getTransactions().get(0)); // getTransactions()
    }
}