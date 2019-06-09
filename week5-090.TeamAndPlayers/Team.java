import java.util.ArrayList;

public class Team {

    private String name;
    private ArrayList<Player> members = new ArrayList<Player>();
    private int size;

    public Team(String name) {
        this.name = name;
        this.size = 16;
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        if (members.size() < size ) {
            members.add(player);
        }

    }

    public void printPlayers() {
        for (Player p : members) {
            System.out.println(p);
        }
    }

    public void setMaxSize(int maxSize) {
        this.size = maxSize;

    }

    public int size() {
        return members.size();
    }

    public int goals() {
        int goals = 0;
        for (Player p: members) {
            goals += p.goals();
        }
        return goals;
    }
}
