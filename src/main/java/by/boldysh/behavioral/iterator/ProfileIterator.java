package by.boldysh.behavioral.iterator;

/**
 * Интерфейс итератора
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
