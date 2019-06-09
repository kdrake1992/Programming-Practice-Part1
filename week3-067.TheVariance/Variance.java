import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        // write code here
        int num = sum(list);
        double mix = (double)num / list.size();

        return mix;
    }

    public static double variance(ArrayList<Integer> list) {
        double var = 0;
        double averageOfList = average(list);
        for (int item : list ) {
            var += Math.pow((item - averageOfList),2);
        }
        return var / (list.size() - 1);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
