package design_patterns.creational.singleton;

public class SingletonExample {

    private static SingletonExample singletonExample;

    private SingletonExample() {
        System.out.println("constructor was called");
        // private constructor to prevent external instantiation
    }

    public static SingletonExample getInstance() {
        if (singletonExample == null) {
            singletonExample = new SingletonExample();
        }
        else {
            System.out.println("getInstance was called");
        }
        return singletonExample;
    }

    public static void main(String[] args) {
        var singletonExample = SingletonExample.getInstance();
        var singleton = SingletonExample.getInstance();
    }
}

