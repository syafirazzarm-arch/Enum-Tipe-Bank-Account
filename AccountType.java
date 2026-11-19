public enum AccountType {
    SAVINGS,
    CREDIT,
    DEPOSIT;

    @Override
    public String toString() {
        switch (this) {
            case SAVINGS:
                return "Savings Account (Tabungan)";
            case CREDIT:
                return "Credit Account (Kredit)";
            case DEPOSIT:
                return "Deposit Account (Deposito)";
            default:
                return "Unknown Account";
        }
    }
}
