import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Run the main catalog program

        Scanner reader = new Scanner(System.in);
        Catalog book = new Catalog();
        String input1 = "";

        System.out.print("?");
        while (!input1.equals("Quit")) {
            input1 = reader.nextLine();
            if (input1.equals("Add")) {
                addCatalog(reader, book);
            }

            else if (input1.equals("Observation")) {
                System.out.print("What was observed:? ");
                String birdName = reader.nextLine();
                addObservation(birdName, book);
            }

            else if (input1.equals("Statistics")) {
                book.printAll();
            }

            else if (input1.equals("Show")) {
                String birdName = reader.nextLine();
                findBird(birdName, book);
            }

        }
    }

    public static void addCatalog(Scanner read, Catalog book) {
        String name;
        String latinName;
        System.out.print("Name: ");
        name = read.nextLine();
        System.out.print("Latin name: ");
        latinName = read.nextLine();

        book.addCatalog(name, latinName);

    }

    public static void addObservation(String bird, Catalog book) {
        for (Bird b : book.getBirds()) {
            if (b.getName().equalsIgnoreCase(bird) || b.getLatinName().equalsIgnoreCase(bird)) {
                b.incrementObservation();
                return;
            }
        }
        System.out.println("Is not a bird!");
    }

    public static void findBird(String bird, Catalog book) {
        for (Bird b : book.getBirds()) {
            if (b.getName().equalsIgnoreCase(bird) || b.getLatinName().equalsIgnoreCase(bird)) {
                System.out.println(b);
                return;
            }
        }
        System.out.println("Is not a bird!");
    }
}