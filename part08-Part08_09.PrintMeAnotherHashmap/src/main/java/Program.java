
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    public static void printValues(HashMap<String, Book> hashmap) {
        String result = "";
        for(Book book : hashmap.values()) {
            result += book.toString() + "\n";
        }
        
        System.out.println(result);
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        String result = "";
        for(Book book : hashmap.values()) {
            if(book.getName().contains(text)) {
                result += book.toString() + "\n";
            }
        }
        
        System.out.println(result);
    }
}
