import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);

        // print both
        System.out.println( "original: " +Arrays.toString(original));
        System.out.println( "reversed: " +Arrays.toString(reverse));
    }

    public static int[] copy(int[] array) {

        int[] send = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            send[i] = array[i];
        }

        return send;
    }

    public static int[] reverseCopy(int[] array) {

        int c = 0;
        int[] send = new int[array.length];
        for (int i = array.length -1 ; i >= 0; i--) {
            send[c] = array[i];
            c++;
        }

        return send;
    }

    
}
