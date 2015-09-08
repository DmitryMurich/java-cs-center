package forTest;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("name1", 10);
        Cat cat2 = new Cat("name1", 10);

        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));

        String s1 = "abc";
        String s2 = "abc";

        System.out.println("-----------------------");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}
