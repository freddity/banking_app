import account.Account;
import account.AccountService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountServiceTest {

    @Test
    void addAccount() {
        var accountService = new AccountService();
        Account account = new Account(accountService.generateNumber());

        accountService.addAccount(account);
        assertEquals(account, accountService.getAccount(account.getNumber()));
    }

    @Test
    void getAccount() {
        var accountService = new AccountService();
        Account account = new Account(accountService.generateNumber());

        accountService.addAccount(account);
        assertEquals(account, accountService.getAccount(account.getNumber()));
    }

    @Test
    void generateNumber() {
        var accountService = new AccountService();

        assertEquals(26, accountService.generateNumber().length());
        assertTrue(accountService.generateNumber().matches("^\\d*$"));
    }
}
