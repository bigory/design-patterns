package by.boldysh.constructional.proxy;

import java.util.HashMap;

/**
 * Интерфейс удалённого сервиса
 */
public interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}
