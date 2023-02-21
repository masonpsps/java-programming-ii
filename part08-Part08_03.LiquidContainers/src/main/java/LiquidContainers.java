
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        while (true) {
            System.out.print("First: " + first + "/100\n"
                    + "Second: " + second + "/100\n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] pieces = input.split(" ");
            String command = pieces[0];
            int amount = Integer.valueOf(pieces[1]);
            
            if(amount < 0) {
                return;
            }

            switch(command) {
                case "add":
                    first = Math.min(first + amount, 100);
                    break;
                case "move":
                    int toMove = Math.min(first, amount);
                    first -= toMove;
                    second = Math.min(second + toMove, 100);
                    break;
                case "remove":
                    second = Math.max(0, second - amount);
                    break;
                default: 
                    return;
            }
        }
    }
}
