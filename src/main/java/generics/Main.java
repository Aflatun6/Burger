package generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main1(String[] args) {
        FootballPlayer a = new FootballPlayer("Jonas");
        BaseballPlayer b = new BaseballPlayer("Harley");
        SoccerPlayer c = new SoccerPlayer("David");
        Team t = new Team("ourTeam");
        t.addPlayer(a);
        t.addPlayer(b);
        t.addPlayer(c);
        System.out.println(t.numPlayer());
    }

    ////////////////////////////////////////////////
    public static void main2(String[] args) {
        FootballPlayer a = new FootballPlayer("Jonas");
        BaseballPlayer b = new BaseballPlayer("Harley");
        SoccerPlayer c = new SoccerPlayer("David");
        Team2<Player> t = new Team2<>("ourTeam");
        t.addPlayer(a);
        t.addPlayer(b);
        t.addPlayer(c);
        System.out.println(t.numPlayer());
    }

    ////////////////////////////////////////////////
    public static void main3(String[] args) {
        FootballPlayer a = new FootballPlayer("Jonas");
        BaseballPlayer b = new BaseballPlayer("Harley");
        SoccerPlayer c = new SoccerPlayer("David");
        Team3<FootballPlayer> t = new Team3<>("ourTeam");
        Player d = new FootballPlayer("Donavan");
        t.addPlayer(a);
        Team3<BaseballPlayer> baseball = new Team3<>("jhjk)");
        Team3<FootballPlayer> e = new Team3<>("Barca");
        e.matchResult(t, 5, 2);
//        t.addPlayer(d);
//        t.addPlayer(b);
//        t.addPlayer(c);
        System.out.println(t.numPlayer());
    }

    //////////////////////////////////////////////
    public static void main(String[] args) {
        Team4<FootballPlayer> mu = new Team4<>("Manchester United");
        Team4<FootballPlayer> barca = new Team4<>("Barcelona");
        Team4<FootballPlayer> juve = new Team4<>("Juventus");
        Team4<FootballPlayer> inter = new Team4<>("Inter");

        mu.matchResult(inter, 5, 1);
        juve.matchResult(barca, 1, 0);
        barca.matchResult(mu, 1, 3);
        juve.matchResult(inter, 2, 3);
        barca.matchResult(mu, 4, 0);
        System.out.println(mu.getName() + " : " + mu.ranking());
        System.out.println(barca.getName() + " : " + barca.ranking());
        System.out.println(juve.getName() + " : " + juve.ranking());
        System.out.println(inter.getName() + " : " + inter.ranking());
        System.out.println(mu.compareTo(barca));
        System.out.println(mu.compareTo(juve));
        System.out.println(juve.compareTo(inter));
        System.out.println(inter.compareTo(mu));
        List<Team4<FootballPlayer>> teams= new ArrayList<>();
        teams.add(mu);
        teams.add(juve);
        teams.add(inter);
        teams.add(barca);
        System.out.println(teams.get(0).getName());


    }
}
