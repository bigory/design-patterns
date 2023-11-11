package by.boldysh.constructional.facade;

import by.boldysh.constructional.decorator.CompressionDecorator;
import by.boldysh.constructional.decorator.DataSource;
import by.boldysh.constructional.decorator.DataSourceDecorator;
import by.boldysh.constructional.decorator.EncryptionDecorator;
import by.boldysh.constructional.decorator.FileDataSource;

import java.io.File;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Main {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}