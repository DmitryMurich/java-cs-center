package multithreading.multithreading1.demo1;

public class HelloThreadMain {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread() {
                @Override
                public void run() {
                    System.out.println("Hello from " + getName());
                }

            }.start();
        }
        System.out.println("Hello from " + Thread.currentThread().getName());

    }

    public static class HelloThread extends Thread {
        @Override
        public void run() {
            System.out.println("Hello from " + getName());
        }
    }

    public static class HelloRunnable implements Runnable {
        public void run() {
            System.out.println("Hello from " + Thread.currentThread().getName());
        }
    }
}


