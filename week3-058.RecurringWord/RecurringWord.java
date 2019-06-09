
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word = "";
        // create here the ArrayList
        while (true) {
            System.out.print("Type a word: ");
            word = reader.nextLine();

            if (words.contains(word)) {
                System.out.println("You gave the word "+ word + " twice");
                break;
            }
            else {
                words.add(word);
            }
        }
    }
}
