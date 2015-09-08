package multithreading.multithreading1.demo3;

public class Account {

    private Long balance;

    public Account() {
        this(0L);
    }

    public Account(Long balance) {
        this.balance = balance;
    }

    private static void checkAmountNonNegative(Long amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount is negative");
        }
    }

    public Long getBalance() {
        return balance;
    }

    public synchronized void deposit(Long amount) {
        checkAmountNonNegative(amount);
        balance += amount;
        notifyAll();
    }

    public synchronized void withdraw(Long amount) {
        checkAmountNonNegative(amount);

        if (balance < amount) {
            throw new IllegalArgumentException("not enough money");
        }
        balance -= amount;


    }

    public synchronized void waitAndWithdraw(Long amount) throws InterruptedException {
        checkAmountNonNegative(amount);
        while (balance < amount) {
            wait(2000);
            System.out.println("Wakeup: " + balance);
        }
        balance -= amount;
    }
}
