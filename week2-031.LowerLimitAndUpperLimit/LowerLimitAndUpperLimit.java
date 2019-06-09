
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("First number: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Second number: ");
        int last = Integer.parseInt(reader.nextLine());

        int counter = first;

        while (counter <= last) {
            System.out.println(counter);
            counter++;
        }
        // write your code here

    }
}
