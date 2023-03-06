
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        String result = "";
        
        for(String key : hashmap.keySet()) {
            result += key + "\n";
        }
        
        System.out.println(result);
    }
    
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        String result = "";
        for(String key : hashmap.keySet()) {
            if(key.contains(text)) {
                result += key + "\n";
            }
        }
        
        System.out.println(result);
    }
    
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        String result = "";
        for(String key : hashmap.keySet()) {
            if(key.contains(text)) {
                result += hashmap.get(key) + "\n";
            }
        }
        
        System.out.println(result);
    }
}
