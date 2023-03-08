
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here
        
        Person person = new Person("Ada", "5009 jerry falls ln");
        
        System.out.println(person.toString() + "|||||");
    }

    public static void printPersons(ArrayList<Person> persons) {
        String result = "";
        for(Person person : persons) {
            result += person.toString() + "\n";
        }
        
        System.out.println(result);
    }
}
