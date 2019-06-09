import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics sum = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();

        System.out.println("Type numbers: ");

        while(true) {
            int i = Integer.parseInt(reader.nextLine());

            if (i == -1) {
                System.out.println("sum: " + sum.sum());
                System.out.println("sum of even: " + even.sum());
                System.out.println("sum of odd: " + odd.sum());
                break;
            }
            else {
                sum.addNumber(i);
                if ((i%2) == 0) {
                    even.addNumber(i);
                }
                else {
                    odd.addNumber(i);
                }
            }

        }


    }
}
