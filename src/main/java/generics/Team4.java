package generics;

import java.util.ArrayList;

public class Team4<T extends Player> implements Comparable<Team4<T>> {
    private String name;
    int played = 0, won = 0, lost = 0, tied = 0;
    ArrayList<T> members = new ArrayList<>();

    public Team4(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " is already on the team"); // Explicitly cast player to the Player class
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " has been added to the team");
            return true;
        }
    }

    public int numPlayer() {
        return this.members.size();
    }

    public void matchResult(Team4<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            message = " beat ";
            won++;
        } else if (ourScore < theirScore) {
            message = " lost to ";
            lost++;
        } else {
            message = " drew with ";
            tied++;
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team4<T> tTeam4) {
        if (this.ranking() > tTeam4.ranking()) {
            return -1;
        } else if (this.ranking() < tTeam4.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
