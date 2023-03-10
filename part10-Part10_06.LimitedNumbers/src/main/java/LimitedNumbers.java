
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> inputs = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            if(input.equals("-1")) {
                break;
            }
            
            inputs.add(input);
        }
        
        inputs.stream()
                .mapToInt(s -> Integer.valueOf(s))
//                .filter(x -> x <= 5)
//                .filter(x -> x >= 1)
                .filter(x -> (x <= 5) && (x >= 1))
                .forEach(x -> System.out.println(x));
    }
}
