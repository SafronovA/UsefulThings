package patterns.singleton;

public class LazySingleton {
    private static LazySingleton INSTANCE = new LazySingleton();

    private LazySingleton() {
    }

    public static LazySingleton gitInstance() {
        return INSTANCE;
    }
}
