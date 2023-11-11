package by.boldysh.behavioral.observer;


import by.boldysh.behavioral.сhainofresponsibility.Middleware;
import by.boldysh.behavioral.сhainofresponsibility.RoleCheckMiddleware;
import by.boldysh.behavioral.сhainofresponsibility.Server;
import by.boldysh.behavioral.сhainofresponsibility.ThrottlingMiddleware;
import by.boldysh.behavioral.сhainofresponsibility.UserExistsMiddleware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

