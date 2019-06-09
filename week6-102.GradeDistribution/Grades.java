import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Grades {

    private ArrayList<Integer> gradebook;
    private int[] sort;
    private int average;


    public Grades() {
        this.gradebook = new ArrayList<Integer>();
        this.sort = new int[6];
        this.average = 0;
    }

    public void add(int number) {
        gradebook.add(number);

        if (number >= 0 && number < 30) {
            this.sort[0] += 1;
        }
        else if (number >= 30 && number < 35) {
            this.sort[1] += 1;
        }
        else if (number >= 35 && number < 40) {
            this.sort[2] += 1;
        }
        else if (number >= 40 && number < 45) {
            this.sort[3] += 1;
        }
        else if (number >= 45 && number < 50) {
            this.sort[4] += 1;
        }
        else if (number >= 50 && number <= 60) {
            this. sort[5] += 1;
        }
    }

    public void starSort() {
        System.out.print("5: ");
        printStars(this.sort[5]);

        System.out.print("4: ");
        printStars(this.sort[4]);

        System.out.print("3: ");
        printStars(this.sort[3]);

        System.out.print("2: ");
        printStars(this.sort[2]);

        System.out.print("1: ");
        printStars(this.sort[1]);

        System.out.print("0: ");
        printStars(this.sort[0]);

    }

    public void printStars(int num) {
        for(int i = 0; i < num; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public double checkAverage() {
        int total = 0;
        for(int i : this.gradebook) {
            if(i > 29){
                total += 1;
            }
        }
        double average = 100 * ((double)total/gradebook.size());
        return average;

    }


}
