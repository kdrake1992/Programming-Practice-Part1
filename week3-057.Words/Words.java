import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        boolean loop = true;
        String word = "";

        while (loop) {
            System.out.print("Type a word: ");
            word = reader.nextLine();
          if (word.isEmpty() == true) {
              loop = false;
          }
          else {
              words.add(word);
          }
        }
        System.out.println("You typed the following words:");
        for (String print : words) {
            System.out.println(print);
        }

    }
}
