// FileHandler.java
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileHandler<T> {
    public void exportToCSV(Storage<T> storage, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
