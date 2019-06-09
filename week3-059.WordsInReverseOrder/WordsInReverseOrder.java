import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word = "";

        while (true) {
            System.out.print("Type a word: ");
            word = reader.nextLine();
            words.add(word);

            if(word.equals("")) {
                System.out.println("You typed the following words:");
                Collections.reverse(words);
                for(String s : words) {
                    System.out.println(s);
                }
                break;
            }

        }
    }
}
