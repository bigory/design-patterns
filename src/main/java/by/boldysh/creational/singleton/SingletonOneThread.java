package by.boldysh.creational.singleton;

/**
 * Топорно реализовать Одиночку очень просто —
 * достаточно скрыть конструктор и предоставить
 * статический создающий метод.
 */
public class SingletonOneThread {
    private static SingletonOneThread instance;
    public String value;

    private SingletonOneThread(String value) {
        // Этот код эмулирует медленную инициализацию.
        this.value = value;
    }

    public static SingletonOneThread getInstance(String value) {
        if (instance == null) {
            instance = new SingletonOneThread(value);
        }
        return instance;
    }

}
