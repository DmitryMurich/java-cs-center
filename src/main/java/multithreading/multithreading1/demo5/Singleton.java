package multithreading.multithreading1.demo5;

public class Singleton {
    private int foo;
    private String bar;

    private Singleton() {
        foo = 13;
        bar = "zap";
    }

    private static Singleton instance;

    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
