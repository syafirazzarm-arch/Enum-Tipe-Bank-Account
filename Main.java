
public class Main {

    public static void main(String[] args) {

        Account account1 = new Account(AccountType.SAVINGS);
        Account account2 = new Account(AccountType.CREDIT);
        Account account3 = new Account(AccountType.DEPOSIT);

        System.out.println("=== BANK ACCOUNT ===");

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

        System.out.println("\n=== ALL ACCOUNT TYPES ===");

        for (AccountType type : AccountType.values()) {
            System.out.println(type);
        }
    }
}
