public class BoundedCounter {
    private int value = 0;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        // write code here
        this.upperLimit = upperLimit;
    }

    public void next() {
        // write code here
        if (this.value == upperLimit) {
            this.value = 0;
        }
        else {
            this.value++;
        }
    }

    public String toString() {
        // write code here
        if (this.value < 10) {
            return "0" + this.value;
        }
        else{
            return "" + this.value;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int number) {
        if (number >= 0 && number <= upperLimit) {
            this.value = number;
        }
    }
}
