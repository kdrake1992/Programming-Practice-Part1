
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        boolean loop = true;
        int count = 0;
//        System.out.println(numberDrawn);

        // program your solution here. Do not touch the above lines!
       while (loop) {
           System.out.print("Guess a number: ");
           int guess = Integer.parseInt(reader.nextLine());

           if (guess < numberDrawn) {
               count++;
               System.out.println("The number is greater, guesses made: " + count);
           }
           else if (guess > numberDrawn) {
               count++;
               System.out.println("The number is lesser, guesses made: " + count);
           }
           else {
               System.out.println("Congratulations, your guess is correct!");
               loop = false;
           }
       }
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
