package service;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class FileReaderImp implements FileReader {

    public List<String> readRecipeLinesToList(String recipe) {
        try (BufferedReader br = Files.newBufferedReader(Paths.get(recipe))) {
            return br.lines().collect(Collectors.toList());
        } catch (IOException e) {
            System.out.println("No such recipe found!");
        }
        return null;
    }
}
