import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        int loop = name.length();
        System.out.print("In reverse order: ");

        while (loop > 0) {
            System.out.print(name.charAt(loop - 1));
            loop--;
        }
    }
}
