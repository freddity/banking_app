package user;

import java.util.List;

public class AccountService {

    private List<Account> accounts;

    public void addAccount(Account u) {
        accounts.add(u);
    }

    public Account getAccount(String number) {
        return (Account) accounts.stream().filter(user -> number.equals(user.getNumber()));
    }
}
