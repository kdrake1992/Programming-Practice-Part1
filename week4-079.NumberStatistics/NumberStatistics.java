
public class NumberStatistics {
    private int amountofNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountofNumbers = 0;

    }

    public void addNumber(int number) {
        // code here
        this.sum = this.sum + number;
        amountofNumbers++;
    }

    public int amountOfNumbers() {
        // code here
        return this.amountofNumbers;
    }
    public int sum() {
        // code here
        return sum;
    }

    public double average() {
        // code here
        if (amountOfNumbers() == 0 ) {
            return 0;

        }
        else {
            return  (double)sum()/amountOfNumbers();
        }

    }


}
