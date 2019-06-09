import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int i = 0;
        int sum = 0;
        int num = 0;
        int even = 0;
        int odd = 0;

        while (i != -1) {
            i = Integer.parseInt(reader.nextLine());
            if (i != -1) {
                sum += i;
                num++;

                if ((i % 2) % 2 == 0) {
                    even++;
                }
                else {
                    odd++;
                }
            }
            else if (i == -1) {
                System.out.println("Thank you and see you later!");
                System.out.println("The sum is " + sum);
                System.out.println("How many numbers: " +  num);
                System.out.println("Average: " + ((double)sum / num));
                System.out.println("Even numbers: " + even);
                System.out.println("Odd numbers: " + odd);

            }
        }
    }
}
