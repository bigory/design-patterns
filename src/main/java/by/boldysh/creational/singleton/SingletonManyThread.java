package by.boldysh.creational.singleton;

/**
 * Для реализации в многопоточной среде
 * требуется синхронизировать потоки
 * при создании объекта-Одиночки.
 */
public class SingletonManyThread {

    // Поле обязательно должно быть объявлено volatile, чтобы двойная проверка
    // блокировки сработала как надо.
    private static volatile SingletonManyThread instance;

    public String value;

    private SingletonManyThread(String value) {
        this.value = value;
    }

    public static SingletonManyThread getInstance(String value) {
        // Техника, которую мы здесь применяем называется «блокировка с двойной
        // проверкой» (Double-Checked Locking). Она применяется, чтобы
        // предотвратить создание нескольких объектов-одиночек, если метод будет
        // вызван из нескольких потоков одновременно.
        //
        // Хотя переменная `result` вполне оправданно кажется здесь лишней, она
        // помогает избежать подводных камней реализации DCL в Java.
        //
        SingletonManyThread result = instance;
        if (result == null) {
            synchronized (SingletonManyThread.class) {
                if (instance == null) {
                    instance = new SingletonManyThread(value);
                }
            }
        }
        return instance;
    }

}
