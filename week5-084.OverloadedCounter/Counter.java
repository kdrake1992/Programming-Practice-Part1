public class Counter {
    private int num;
    private boolean checker;

    public Counter(int startingValue, boolean check) {
        this.num = startingValue;
        this.checker = check;
    }

    public Counter(int startingValue) {
        this(startingValue, false);
    }

    public Counter(boolean check) {
        this(0, check);
    }

    public Counter() {
        this(0, false);
    }

    public int value() {
        return this.num;
    }

    public void increase() {
       this.increase(1);
    }

    public void decrease() {
        if (checker){
            if (num > 0) {
                this.num--;
            }
        }
        else{
            this.num--;
        }

    }

    public void increase(int increaseAmount) {
        if (increaseAmount > 0)
            this.num += increaseAmount;
    }

    public void decrease(int decreaseAmount) {
        if (decreaseAmount < 0) {
            // nothing
        }
        else {
            if (decreaseAmount > 0) {
                if (checker) {
                    if (decreaseAmount <= this.num) {
                        this.num -= decreaseAmount;
                    }
                    else {
                        this.num = 0;
                    }
                }
                else{
                    this.num -= decreaseAmount;
                }
            }
            }
        }

    }
