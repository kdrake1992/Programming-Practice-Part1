import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collections;

    public Library() {
        this.collections = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        collections.add(newBook);
    }

    public void printBooks() {
        for(Book b: collections) {
            System.out.println(b);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book>  titles = new ArrayList<Book>();
        for(Book b: collections) {
            if(StringUtils.included(b.title(), title)) {
                titles.add(b);
            }
        }
        return titles;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> publish = new ArrayList<Book>();
        for(Book b: collections) {
            if(StringUtils.included(b.publisher(), publisher)) {
                publish.add(b);
            }
        }
        return publish;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book>  ye = new ArrayList<Book>();
        for(Book b: collections) {
            if(b.year() == year) {
                ye.add(b);
            }
        }
        return ye;

    }

}
