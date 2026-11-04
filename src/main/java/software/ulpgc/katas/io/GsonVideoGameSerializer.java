package software.ulpgc.katas.io;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import software.ulpgc.katas.model.VideoGame;

import java.util.List;
import java.util.Map;

public class GsonVideoGameSerializer implements VideoGameSerializer {
    @Override
    public String serialize(List<VideoGame> games) {
        // Bloque de metadatos requerido por la rúbrica
        Map<String, Object> output = Map.of(
                "metadata", Map.of(
                        "dataset", "Videojuegos",
                        "registrosValidosGenerados", games.size()
                ),
                "videojuegos", games
        );

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(output);
    }
}