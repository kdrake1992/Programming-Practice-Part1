
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int loop = 0;
        int count = 1;
        System.out.print("Type your name: ");
        String name = reader.nextLine();

        while (loop < name.length()) {
            System.out.println(count + ". character: " + name.charAt(loop));
            loop++;
            count++;
        }
    }
}
