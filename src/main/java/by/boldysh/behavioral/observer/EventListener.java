package by.boldysh.behavioral.observer;

import java.io.File;

/**
 * Интерфейс подписчиков
 */
public interface EventListener {
    void update(String eventType, File file);
}
