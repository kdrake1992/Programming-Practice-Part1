import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Grades gradebook = new Grades();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type exam scores, -1 completes:");

        while (true) {
            int i = Integer.parseInt(scanner.nextLine());
            if (i == -1) {
                break;
            } else if (i < 0 || i > 60) {
                System.out.println("Try again");
            } else {
                gradebook.add(i);
            }
        }

        System.out.println("Grade distribution:");
        gradebook.starSort();
        System.out.print("Acceptance percentage: " +  gradebook.checkAverage());
    }
}