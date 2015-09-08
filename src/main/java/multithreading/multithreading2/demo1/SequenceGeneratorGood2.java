package multithreading.multithreading2.demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGeneratorGood2 {

    private static AtomicInteger counter = new AtomicInteger();

    public static int nextInt() {
        return counter.getAndIncrement();
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
