import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here

        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);

    }

    public static int smallest(int[] numbers) {
        int small = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
          if(numbers[i] < small) {
              small = numbers[i];
          }
        }
        return small;
    }

    public static int indexOfTheSmallest(int[] numbers) {
       int small = smallest(numbers);
       for (int i = 0; i < numbers.length; i++) {
           if (numbers[i] == small) {
               return i;
           }
       }
       return 0;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        // write the code here
        int[] copy = new int[array.length - index];

        for (int i = 0; i < copy.length; i++) {
            copy[i] = array[i + index];
        }
        return indexOfTheSmallest(copy) + index;
    }

    public static void swap(int[] array, int index1, int index2) {
        // code goes here
        int first = array[index1];
        int second = array[index2];

        array[index2] = first;
        array[index1] = second;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        int smallest;

        for (int i = 0; i < array.length - 1; i++) {
            smallest = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallest);
            System.out.println(Arrays.toString(array));
        }
    }


}
