
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        readStats("literacy.csv");
    }
    
    public static ArrayList<String> readStats(String file) {
        ArrayList<String> rows = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file))
                    .map(row -> row.split(","))
                    .filter(p -> p.length >= 6)
                    .sorted((p1, p2) -> p1[5].compareTo(p2[5]))
                    .forEach(p -> System.out.println(p[3] + " (" + p[4] + "), " + p[2].trim().split(" ")[0] + ", " + p[5]));
//                    .forEach(row -> {
//                        String[] pieces = row.split(",");
//                        pieces[2] = pieces[2].trim().split(" (%)")[0];
//                        rows.add(pieces[3] + " (" + pieces[4] + "), " + pieces[2] + ", " + pieces[5]);
//                    })
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return rows;
    }
}
