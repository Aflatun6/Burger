package generics.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {
    private String name;

    ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already in the league " + getName());
            return false;
        }
        System.out.println("Adding " + team.getName() + " to the the league " + getName());
        teams.add(team);
        return true;
    }

    public String table(){
        Collections.sort(teams);// IT WORKS BECAUSE WE HAVE OVERRIDED COMPARETO() FUNCTION AND CLEARLY SPECIFIED BY WHICH FACTOR SORT ACCORDING.
        StringBuilder st = new StringBuilder();
        for(T t : teams){
            st.append(t.toString()).append("\n");
        }
        return st.toString();
    }



    public String toString() {
        return table();
    }
}
