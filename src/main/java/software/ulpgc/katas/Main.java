package software.ulpgc.katas;

import software.ulpgc.katas.io.CsvVideoGameLoader;
import software.ulpgc.katas.io.GsonVideoGameSerializer;
import software.ulpgc.katas.model.VideoGame;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File file = new File("videogames.csv");
        List<VideoGame> games = new CsvVideoGameLoader(file).load();

        String jsonOutput = new GsonVideoGameSerializer().serialize(games);

        try (FileWriter writer = new FileWriter("videojuegos_salida.json")) {
            writer.write(jsonOutput);
            System.out.println("Exito: JSON generado y guardado en videojuegos_salida.json");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
    }
}