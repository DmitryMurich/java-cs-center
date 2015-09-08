package multithreading.multithreading2.demo1;

import java.util.ArrayList;
import java.util.List;

public class SequenceGeneratorBroken {

    private static volatile int counter = 0;

    public static int nextInt() {
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
            for (int i = 0; i < 10000000; i++) {
                nextInt();
            }
        }
    }
}
