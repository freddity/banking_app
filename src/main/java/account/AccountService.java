package account;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AccountService {

    private final List<Account> accounts = new ArrayList<>();

    public void addAccount(Account u) {
        accounts.add(u);
    }

    public Account getAccount(String number) {
        for (Account a : accounts) {
            if (a.getNumber().equals(number)) {
                return a;
            }
        }
        return null;
    }

    // TODO add duplications check
    public String generateNumber() {
        StringBuilder number = new StringBuilder();
        Random random = new Random();

        for (int i = 1; i <= 26; i++) {
            number.append(random.nextInt(10));
        }

        return number.toString();
    }
}
