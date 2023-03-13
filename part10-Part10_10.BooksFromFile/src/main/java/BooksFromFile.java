
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file))
                    .forEach(row -> {
                        String[] pieces = row.split(",");
                        books.add(new Book(pieces[0], 
                                Integer.valueOf(pieces[1]), 
                                Integer.valueOf(pieces[2]), 
                                pieces[3]));
                    });
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return books;
    }
}
