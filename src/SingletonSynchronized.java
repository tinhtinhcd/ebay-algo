//implement singleton with synchronized

public class SingletonSynchronized {
    private static SingletonSynchronized instance = null;

    private SingletonSynchronized() {
    }

    public static SingletonSynchronized getInstance() {

        synchronized (SingletonSynchronized.class) {
            if (instance == null)
                return new SingletonSynchronized();
        }
        return instance;
    }
}
