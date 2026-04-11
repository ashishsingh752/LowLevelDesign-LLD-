package creationaldesignpattern.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2);        // true
        System.out.println(s1.hashCode() == s2.hashCode()); // true

        s1.showMessage();
    }
}
