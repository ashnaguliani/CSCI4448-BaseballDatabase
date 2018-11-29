import Player.Player;
import Statistics.PitchingStatistic;
import Statistics.PitchingStatisticBuilder;
import UserAuthentication.UserAuthentication;
import Database.Database;
import SparkEndpoints.SparkEndpoints;

import java.util.ArrayList;
import java.util.UUID;

public class Main {
    public static void main(String[] args)
    {
        UserAuthentication userAuthentication = new UserAuthentication();
        Database database = new Database();
        database.addTeam("colorado buffaloes");
        database.addAdmin("ashna", "a_password", "a_email");
        database.addUser("rhea", "r_password", "r_email");
        database.team.addPlayer("britt");
        database.team.addPlayer("madi");
        database.setSignedIn(database.getUser("ashna")); //fake login


        String playerID = "britt";
        UUID createdBy = database.getSignedIn().getUserID();
        PitchingStatistic newStat = new PitchingStatisticBuilder().createPitchingStatistic(createdBy, 5, 5,
                5, 5, 5, 5, 5, 5, 5, 5, 5);

        PitchingStatistic newStat1 = new PitchingStatisticBuilder().createPitchingStatistic(createdBy, 5, 5,
                5, 5, 5, 5, 5, 5, 5, 5, 5);

        ArrayList<Player> playersOnTeam = database.team.getPlayersOnTeam();
        for (Player player : playersOnTeam){
            if(player.getPlayerId().equals(playerID)){
                player.addStatistic(newStat);
                player.addStatistic(newStat1);
            }
        }



        SparkEndpoints sparkEndpoints = new SparkEndpoints(userAuthentication, database);
        sparkEndpoints.serve();
    }
}