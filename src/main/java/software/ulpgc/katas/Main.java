package software.ulpgc.katas;

import software.ulpgc.katas.io.CsvVideoGameLoader;
import software.ulpgc.katas.io.GsonVideoGameSerializer;
import software.ulpgc.katas.model.VideoGame;

import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("videogames.csv");
        List<VideoGame> games = new CsvVideoGameLoader(file).load();

        String jsonOutput = new GsonVideoGameSerializer().serialize(games);
        System.out.println(jsonOutput);
    }
}