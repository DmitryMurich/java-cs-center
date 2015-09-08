package multithreading.multithreading1.demo3;

public class Demo3 {
    public static void main(String[] args) throws Exception{
        Account account = new Account(0L);

        new DepositThread(account).start();

        System.out.println("Calling waitAndWithdraw()...");

        account.waitAndWithdraw(50000000L);

        System.out.println("waitANdWithdraw() finished");
    }

    private static class DepositThread extends Thread {

        private final Account account;

        private DepositThread(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            for (int i = 0; i < 50000000; i++) {
                account.deposit(1L);
            }
        }
    }
}
