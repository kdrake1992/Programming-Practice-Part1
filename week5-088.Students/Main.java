
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        ArrayList<Student> list = new ArrayList<Student>();
        ArrayList<Student> search = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);


        while(true) {
            System.out.print("name: ");
            String name = reader.nextLine();

            if (name.equals("")) {
                break;
            }
            else {
                System.out.print("studentnumber: ");
                String studentNumber = reader.nextLine();
                list.add(new Student(name, studentNumber));

            }
        }
        for (Student s: list) {
            System.out.println(s);

        }

        while (true) {
            search.clear();
            System.out.print("Give search terms: ");
            String letter = reader.nextLine();

            if (letter.equals("")) {
                break;
            }
            else {
                for (Student s: list) {
                    if (s.getName().contains(letter)) {
                        search.add(s);
                    }
                }
            }
            System.out.println("Result:");
            for (Student sear: search) {
                System.out.println(sear);
            }
        }
    }
}
