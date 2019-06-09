
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.
        while (true) {
            System.out.println("Input temperature here: ");
            double temperature = Double.parseDouble(reader.nextLine());


            if (temperature >= -30 && temperature <= 40) {
                System.out.println("This will be added to the graph since it is"
                        + " between -30 and +40 degrees.");
                Graph.addNumber(temperature);
            }

            else {
                System.out.println("The temperature is outside the program's set"
                        + " conditions");
            }
        }




            // Write your code here.

   }
}
