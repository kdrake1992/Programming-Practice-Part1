
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int count = 1;
        System.out.print("Up to what number? ");
        int read = Integer.parseInt(reader.nextLine());

        while (count <= read) {
            System.out.println(count);
            count++;
        }
        // Write your code here
        
    }
}
