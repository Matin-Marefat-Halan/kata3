package software.ulpgc.katas.io;

import software.ulpgc.katas.model.VideoGame;
import java.util.List;

public interface VideoGameSerializer {
    String serialize(List<VideoGame> games);
}