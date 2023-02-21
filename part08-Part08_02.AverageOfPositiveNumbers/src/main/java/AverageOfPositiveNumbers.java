
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int amt = 0;
        while(true) {
            int input = Integer.valueOf(scanner.nextLine());
            if(input == 0) {
                break;
            }
            
            if(input > 0) {
                sum += input;
                amt++;
            }
        }
        
        if(amt == 0) {
            System.out.println("Cannot calculate the average");
            return;
        }
        System.out.println((double)sum / amt);
    }
}
