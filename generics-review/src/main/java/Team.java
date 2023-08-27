import java.util.ArrayList;
    public class Team<T extends Player> { // Type checking needed and Player need to extends limit  accept only player
//    public class Team<T> { // Type checking needed - specify the <T> -- <E> in java doc
//    public class Team { // Type checking needed - Soccer, Baseball, Basketball
    private String name;

//    private ArrayList<Player> members = new ArrayList<>(); // need to change <player> belongs to soccer

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public boolean addPlayer(Player player) { // nned to change player
        public boolean addPlayer(T player) {
        if(members.contains(player)) {
//            System.out.println(player.getName()+ " is already on this team"); // getName complain need to casting
//            System.out.println(((Player)player).getName()+ " is already on this team"); // casted Player(player)
            System.out.println(player.getName()+ " is already on this team"); // no need anymore casted Player(player)- public class Team<T extends Player> {} updated
            return false;
        }else {
           members.add(player);
//            System.out.println(player.getName()+ " picked for team " + this.name); // getName complain need to casting
//            System.out.println(((Player)player).getName()+ " picked for team " + this.name); // casted Player(player)
            System.out.println(player.getName()+ " picked for team " + this.name); // no need anymore casted Player(player)- public class Team<T extends Player> {} updated
        return true;
        }

    }

    public int numPlayers() {
        return this.members.size();
    }
}
