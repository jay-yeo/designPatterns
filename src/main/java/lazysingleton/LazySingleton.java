package lazysingleton;

public class LazySingleton {
    private LazySingleton singletonObject = new LazySingleton();

    public LazySingleton getInstance() {
        return singletonObject;
    }

    private LazySingleton() {
        if (singletonObject == null) {
            this.singletonObject = new LazySingleton();
        }
    }
}
