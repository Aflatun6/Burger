package generics.challenge;

public class Main {
    public static void main(String[] args) {
        Team<FootballPlayer> mu = new Team<>("Manchester United");
        Team<FootballPlayer> juve = new Team<>("Juventus");
        Team<FootballPlayer> barca = new Team<>("Barcelona");
        Team<FootballPlayer> inter = new Team<>("Internazionale");
        Team<BaseballPlayer> baseball = new Team<>("Baseball team");
        League<Team<FootballPlayer>> league = new League<>("A");
//        league.addTeam(baseball);
        league.addTeam(mu);
        league.addTeam(barca);
        league.addTeam(juve);
        league.addTeam(inter);
        mu.match(barca, 5, 2);
        juve.match(inter, 1, 1);
        inter.match(mu, 3, 1);
        barca.match(juve, 1, 4);
        juve.match(mu, 1, 5);
        barca.match(inter, 3, 0);
        mu.match(barca, 1, 2);
        inter.match(juve, 0, 0);
        System.out.println(league);


    }
}
