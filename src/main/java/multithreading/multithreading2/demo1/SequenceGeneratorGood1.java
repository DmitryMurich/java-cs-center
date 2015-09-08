package multithreading.multithreading2.demo1;

import java.util.ArrayList;
import java.util.List;

public class SequenceGeneratorGood1 {

    private static int counter = 0;

    public static synchronized int nextInt() {
        return counter++;
    }

    public static void main(String[] args) throws Exception {
        List<Thread> threads = new ArrayList<Thread>();

        for (int i = 0; i < 10; i++) {
            MyThread thread = new MyThread();
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Counter final value: " + counter);
    }

    public static class MyThread extends  Thread {
        @Override
        public void run() {
            for (int i = 0; i < 1000000; i++) {
                nextInt();
            }
        }
    }
}
