import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int lengthPass;
    private String password;


    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.lengthPass = length;
        this.password = "";
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        password = "";
        while(i < this.lengthPass) {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(26));
            this.password += symbol;
            i++;
        }
        return this.password;
    }
}
