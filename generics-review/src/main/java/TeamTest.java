import java.util.ArrayList;

public class TeamTest {

    public static void main(String[] args) {

        SoccerPlayer messi = new SoccerPlayer("Messi");
        BasketballPlayer curry = new BasketballPlayer("Curry");
        BaseballPlayer pat = new BaseballPlayer("Pat");


        // Team class has 1 argument constructor so need to value
        // if not exist this - it can be possible to creat without parameter
//        Team ManCity = new Team(); // complain

        //        Mancity accept all player soccer, baseball, basketball

//        Team ManCity = new Team("ManCity"); //accept all players
//
//        ManCity.addPlayer(messi);
//        ManCity.addPlayer(curry);
//        ManCity.addPlayer(pat);
//
//        System.out.println(ManCity.numPlayers());

    // After adding the <T> on the Team class

        Team<SoccerPlayer> ManCity = new Team<>("ManCity"); //Accept only SoccerPlayer

//        Team<String> brokenTeam = new Team<>("this not work"); // no complain - run nothing
        // So need to extends team and limit Team class type only Player
        //     public class Team<T extends Player> {} updated
//        Team<String> brokenTeam = new Team<>("this not work"); // now complaining - not accepting String type bc only Player

        ManCity.addPlayer(messi);
//        ManCity.addPlayer(curry); // incompatible type - Error BasketBall player
//        ManCity.addPlayer(pat);  // incompatible type - Error BaseBall player

        System.out.println(ManCity.numPlayers());



    }
}
