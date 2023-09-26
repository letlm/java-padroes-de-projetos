package design.patterns.singleton;

public class SingletonLazyHolder {
    private static class Holder{
        public static SingletonLazyHolder instance = new SingletonLazyHolder();;
    }
    private SingletonLazyHolder() {
    }

    public static SingletonLazyHolder getInstance() {

        return Holder.instance;
    }
}
