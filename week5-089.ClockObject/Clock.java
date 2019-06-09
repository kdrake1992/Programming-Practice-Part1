public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.hours = new BoundedCounter(23);
        this.minutes = new BoundedCounter(59);
        this.seconds = new BoundedCounter(59);

        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning);
    }
    
    public void tick() {
        // Clock advances by one second
        if (this.seconds.getValue() == 59) {
            if (this.minutes.getValue() == 59) {
                if (this.hours.getValue() == 23) {
                    this.hours.setValue(0);
                } else {
                    this.hours.next();
                }
                this.minutes.setValue(0);
            } else {
                this.minutes.next();
            }
            this.seconds.setValue(0);
        }
        else {
            this.seconds.next();
        }

        }
    
    public String toString() {
        // returns the string representation
        return this.hours.toString() + ":" + this.minutes.toString() + ":" + this.seconds.toString();
    }
}
