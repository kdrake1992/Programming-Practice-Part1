import java.util.ArrayList;

//Create a catalog for birds
public class Catalog {

    private ArrayList<Bird> catalog;
    private Bird bird;

    public Catalog() {
        this.catalog = new ArrayList<Bird>();
    }

    public void addCatalog(String name, String latin){
        bird = new Bird(name, latin);
        this.catalog.add(bird);
    }

    public ArrayList<Bird> getBirds() {
        return this.catalog;
    }

    public void printAll() {
        for(Bird b : this.catalog) {
            System.out.println(b);
        }
    }



}