import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        String reverse = "";
        int length = text.length() - 1;


        while (length >=  0) {
            reverse += text.charAt(length);
            length--;

        }
        if (text.equals(reverse)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
