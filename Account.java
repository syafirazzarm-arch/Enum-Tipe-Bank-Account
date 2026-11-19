
public class Account {

    private AccountType type;

    public Account(AccountType type) {
        this.type = type;
    }

    public AccountType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Account Type: " + type;
    }
}
