package multithreading.multithreading1.demo2;

public class Demo2 {
    public static void main(String[] args) throws Exception{
        Account account = new Account(100000000L);
        System.out.println("Begin balance = " + account.getBalance());

        Thread withdrawThread = new WithdrawThread(account);
        Thread depositThread = new DepositThread(account);
        withdrawThread.start();
        depositThread.start();

        withdrawThread.join();
        depositThread.join();

        System.out.println("End balance = " + account.getBalance());
    }

    private static class WithdrawThread extends Thread {

        private Account account;

        public WithdrawThread(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            for (int i = 0; i < 20000000; i++) {
                account.withdraw(1L);
            }
        }
    }

    private static class DepositThread extends Thread {

        private Account account;

        public DepositThread(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            for (int i = 0; i < 20000000; i++) {
                account.deposit(1L);
            }
        }
    }
}
