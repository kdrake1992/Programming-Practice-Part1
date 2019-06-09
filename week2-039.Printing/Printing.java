public class Printing {

    public static void printStars(int amount) {
        // you can print one star with the command
        // call this command amount times
        int stars = 0;
        while(stars < amount) {
            System.out.print("*");
            stars++;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        int square = 0;
        while(square < sideSize) {
            printStars(sideSize);
            square++;
        }
    }

    public static void printRectangle(int width, int height) {
        int rectangle = 0;
        int loop1 = 0;
        int loop2 = 0;

        while(rectangle < height) {
            if(loop1 < width) {
                printStars(width);
                loop1 += width;
            }
            else if (loop2 < height) {
                loop1 = 0;
                loop2++;
                rectangle++;
            }
            else {
                rectangle++;
            }
        }

    }

    public static void printTriangle(int size) {
        int loop = 1;
        while (loop < size){
            while (loop <= size) {
                printStars(loop);
                loop++;
            }
            loop += size;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("---");
        printRectangle(5, 6);
        System.out.println("---");
        printTriangle(3);
        System.out.println("---");
    }

}
