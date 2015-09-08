package multithreading.multithreading1.demo2;

public class Account {

    private Long balance;

    public Account() {
        this(0L);
    }

    public Account(Long balance) {
        this.balance = balance;
    }

    public Long getBalance() {
        return balance;
    }

    public void deposit(Long amount) {
        checkAmountNonNegative(amount);
        synchronized (this) {
            balance += amount;
        }
    }

    public void  withdraw(Long amount) {
        checkAmountNonNegative(amount);
        synchronized (this) {
            if (balance < amount) {
                throw new IllegalArgumentException("not enough money");
            }
            balance -= amount;
        }

    }

    private static void checkAmountNonNegative(Long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount is negative");
        }
    }
}
