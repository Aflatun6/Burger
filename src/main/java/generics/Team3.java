package generics;

import java.util.ArrayList;

public class Team3<T extends Player> {
    private String name;
    int played = 0, won = 0, lost = 0, tied = 0;
    ArrayList<T> members = new ArrayList<>();

    public Team3(String name) {
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

    public void matchResult(Team3<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            message= " beat ";
            won++;
        } else if (ourScore < theirScore) {
            message= " lost to ";
            lost++;
        } else {
            message= " drew with ";
            tied++;
        }
        played++;
        if (opponent != null) {
            System.out.println(this.getName()+message+opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }

}
