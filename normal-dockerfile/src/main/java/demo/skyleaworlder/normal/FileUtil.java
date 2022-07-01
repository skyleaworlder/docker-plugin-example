package demo.skyleaworlder.normal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileUtil {
    public static void print(String path) {
        Path p = Paths.get(path);
        try (Stream<String> stream = Files.lines(p)) {
            stream.forEach(System.out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
