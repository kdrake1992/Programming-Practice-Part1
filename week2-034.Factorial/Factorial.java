import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int until = Integer.parseInt(reader.nextLine());
        int fac = 1;

        while (until >= 1) {
            fac *= until;
            until--;
        }

        System.out.println("Factorial is " + fac);

    }
}
