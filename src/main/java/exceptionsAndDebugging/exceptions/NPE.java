package exceptionsAndDebugging.exceptions;

public class NPE {
    public static void main(String[] args) {
        Object string = "adgergeg";
        try {
            System.out.println((Integer) string);
        } catch (ClassCastException e) {
            System.out.println(e.getClass().getSimpleName());
        }

        System.out.println(string instanceof String);
    }
}
