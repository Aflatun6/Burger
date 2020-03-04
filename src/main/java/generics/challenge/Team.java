package generics.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    private int played = 0, won = 0, lost = 0, tied = 0;
    private List<T> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (players.contains(player)) {
            System.out.println(player.getName() + " is already in the team");
            return false;
        }
        players.add(player);
        System.out.println(player.getName() + " has been added to the " + getName());
        return true;
    }

    public int numPlayer() {
        return players.size();
    }

    public boolean removePlayer(T player) {
        if (players.contains(player)) {
            System.out.println(player.getName() + " has been sent off the " + getName());
            players.remove(player);
            return true;
        }
        System.out.println(getName() + " does not have " + player.getName());
        return false;
    }

    public void match(Team opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            won++;
            message = " beated ";
        } else if (ourScore < theirScore) {
            lost++;
            message = " lost to ";

        } else {
            tied++;
            message = " tied with ";

        }
        played++;
        if (opponent != null) {
            System.out.println(getName() + message + opponent.getName() + " \tScore = " + ourScore + " : " + theirScore);
            opponent.match(null, theirScore, ourScore);
        }
    }

    public int ranking() {
        return (won * 3) + tied - lost;
    }

    @Override
    public int compareTo(Team<T> tTeam) { // MAKES COLLECTIONS.SORT() WORK. IT WILL BE SORTED DUE TO THIS FUNCTION LOGIC
        if (ranking() > tTeam.ranking()) return -1;
        else if (ranking() < tTeam.ranking()) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return getName() + " == " + ranking();
    }
}
