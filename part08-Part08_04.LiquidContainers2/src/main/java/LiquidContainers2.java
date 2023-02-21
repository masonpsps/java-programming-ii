
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.print("First: " + first.toString() + "\n"
                    + "Second: " + second.toString() + "\n");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] pieces = input.split(" ");
            int amt = Integer.valueOf(pieces[1]);
            
            if(pieces[0].equals("add")) {
                first.add(amt);
            } else if(pieces[0].equals("move")) {
                int toMove = Math.min(first.contains(), amt);
                first.remove(toMove);
                second.add(toMove);
            } else if(pieces[0].equals("remove")) {
                second.remove(amt);
            }
        }
    }

}
