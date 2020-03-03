package generics;

import java.util.ArrayList;

public class Team2<T> {
    private String name;
    int played = 0, won = 0, lost = 0, tied = 0;
    ArrayList<T> members = new ArrayList<>();

    public Team2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(((Player) player).getName() + " is already on the team"); // Explicitly cast player to the Player class
            return false;
        } else {
            members.add(player);
            System.out.println(((Player) player).getName() + " has been added to the team");
            return true;
        }
    }

    public int numPlayer() {
        return this.members.size();
    }

    public void matchResult(Team2 opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            won++;
        } else if (ourScore < theirScore) {
            lost++;
        } else {
            tied++;
        }
        played++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

}
