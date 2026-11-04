package software.ulpgc.katas.io;

import software.ulpgc.katas.model.VideoGame;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class CsvVideoGameLoader implements VideoGameLoader {
    private final File file;

    public CsvVideoGameLoader(File file) {
        this.file = file;
    }

    @Override
    public List<VideoGame> load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            return reader.lines()
                    .skip(1)
                    .map(this::toVideoGame)
                    .flatMap(Optional::stream)
                    .toList();
        } catch (IOException e) {
            return List.of();
        }
    }

    private Optional<VideoGame> toVideoGame(String line) {
        String[] fields = line.split(",");
        try {
            return Optional.of(new VideoGame(
                    fields[0],
                    fields[1],
                    Integer.parseInt(fields[2]),
                    fields[3]
            ));
        } catch (Exception e) {
            return Optional.empty();
        }
    }
}