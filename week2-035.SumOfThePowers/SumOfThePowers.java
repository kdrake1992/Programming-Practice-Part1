
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        double userin = Double.parseDouble(reader.nextLine());
        int first = 0;
        int last = 0;

        while (first <= userin) {
            last = last + (int)(Math.pow(2,userin));
            userin--;
        }

        System.out.println("The result is " + last);
    }
}
