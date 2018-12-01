package patterns.singleton;

public class Singleton {
    private static Singleton INSTANCE = null;

    private Singleton() {
    }

    public static Singleton gitInstance() {
        return INSTANCE = INSTANCE == null ? new Singleton() : INSTANCE;
    }
}
