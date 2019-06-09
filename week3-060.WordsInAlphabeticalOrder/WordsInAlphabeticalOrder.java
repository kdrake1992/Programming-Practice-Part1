
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        String word = "";
        // create here an ArrayList

        while (true) {
            System.out.print("Type a word: ");
            word = reader.nextLine();
            words.add(word);

            if (word.equals("")) {
                Collections.sort(words);
                for(String s : words) {
                    System.out.println(s);
                }
                break;
            }
        }
    }
}
