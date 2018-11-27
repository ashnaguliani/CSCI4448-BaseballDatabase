package SparkEndpoints;

import static spark.Spark.*;

import Player.Player;
import Statistics.*;
import User.*;
import UserAuthentication.UserAuthentication;
import Database.Database;
import JsonUtil.JsonUtil;
import ResponseError.ResponseError;
import com.google.gson.*;

import java.util.ArrayList;
import java.util.UUID;


public class SparkEndpoints {

    private final UserAuthentication userAuthentication;
    private Database database;
    Gson gson = new Gson();


    public SparkEndpoints(UserAuthentication userAuthentication, Database database)
    {
        this.userAuthentication = userAuthentication;
        this.database = database;
    }

    public void serve() {
        get("/hello", (req, res) -> "Hello Dudes");

        post("/login", (req, res) -> {
            JsonObject jsonObject = new JsonParser().parse(req.body()).getAsJsonObject();
            String username = jsonObject.get("username").getAsString();
            String password = jsonObject.get("password").getAsString();
            boolean status = userAuthentication.authenticateUserLogin(database, username, password);
            if(status){
                database.setSignedIn(database.getUser(username));
                return "Access granted";
            }
            else{
                res.status(400);
                return new ResponseError("Access not granted");
            }
        }, JsonUtil.json());

        get("/get_all_users", (req, res) -> database.getUsers(), JsonUtil.json());

        post("/get_user", (req, res) -> {
            JsonObject jsonObject = new JsonParser().parse(req.body()).getAsJsonObject();
            String username = jsonObject.get("username").getAsString();
            User user = database.getUser(username);
            if (user != null) {
                return user;
            }
            res.status(400);
            return new ResponseError("No user with username %s found", username);
        }, JsonUtil.json());

        post("/add_user", (req, res) -> {
            JsonObject jsonObject = new JsonParser().parse(req.body()).getAsJsonObject();
            String username = jsonObject.get("username").getAsString();
            String password = jsonObject.get("password").getAsString();
            String email = jsonObject.get("email").getAsString();

            if(database.addUser(username, password, email)) return "User added";
            else{
                res.status(400);
                return new ResponseError("Username taken", username);
            }
        }, JsonUtil.json());

        get("/get_all_players", (req, res) -> database.team.getPlayersOnTeam(), JsonUtil.json());

        post("/get_player_stats", (req, res) -> {
            JsonObject jsonObject = new JsonParser().parse(req.body()).getAsJsonObject();
            String playerID = jsonObject.get("playerID").getAsString();

            ArrayList<Player> playersOnTeam = database.team.getPlayersOnTeam();
            for (Player player : playersOnTeam){
                if(player.getPlayerId().equals(playerID)){
                    return player.getStatistics();
                }
            }
            res.status(400);
            return new ResponseError("No stats found for player", playerID);
        }, JsonUtil.json());

        post("/add_player", (req, res) -> {
            JsonObject jsonObject = new JsonParser().parse(req.body()).getAsJsonObject();
            String playerID = jsonObject.get("playerID").getAsString();
            return database.team.addPlayer(playerID);
        }, JsonUtil.json());

        post("/add_batting_statistic", (req, res) -> {
            JsonObject jsonObject = new JsonParser().parse(req.body()).getAsJsonObject();
            if(database.getSignedIn() == null){
                return "Error: Not signed in";
            }
            UUID createdBy = database.getSignedIn().getUserID();
            String playerID = jsonObject.get("playerID").getAsString();

            int games = jsonObject.get("games").getAsInt();
            int plateAppearances = jsonObject.get("plateAppearances").getAsInt();
            int runs = jsonObject.get("runs").getAsInt();
            int hits = jsonObject.get("hits").getAsInt();
            int doubles = jsonObject.get("doubles").getAsInt();
            int triples = jsonObject.get("triples").getAsInt();
            int homeRuns = jsonObject.get("homeRuns").getAsInt();
            int runsBattedIn = jsonObject.get("runsBattedIn").getAsInt();
            int stolenBases = jsonObject.get("stolenBases").getAsInt();
            int caughtStealing = jsonObject.get("caughtStealing").getAsInt();
            int walks = jsonObject.get("walks").getAsInt();
            int strikeouts = jsonObject.get("strikeouts").getAsInt();

            BattingStatistic newStat = new BattingStatisticBuilder().createBattingStatistic(createdBy, games,
                    plateAppearances, runs, hits, doubles, triples, homeRuns, runsBattedIn, stolenBases,
                    caughtStealing, walks, strikeouts);

            ArrayList<Player> playersOnTeam = database.team.getPlayersOnTeam();
            for (Player player : playersOnTeam){
                if(player.getPlayerId().equals(playerID)){
                    player.addStatistic(newStat);
                    return "Statistic Added";
                }
            }
            res.status(400);
            return new ResponseError("PlayerID not found", playerID);

        }, JsonUtil.json());

        post("/add_pitching_statistic", (req, res) -> {
            JsonObject jsonObject = new JsonParser().parse(req.body()).getAsJsonObject();
            if(database.getSignedIn() == null){
                return "Error: Not signed in";
            }
            UUID createdBy = database.getSignedIn().getUserID();
            String playerID = jsonObject.get("playerID").getAsString();

            int games = jsonObject.get("games").getAsInt();
            int wins = jsonObject.get("wins").getAsInt();
            int saves = jsonObject.get("saves").getAsInt();
            int losses = jsonObject.get("losses").getAsInt();
            int inningsPitched = jsonObject.get("inningsPitched").getAsInt();
            int runs = jsonObject.get("runs").getAsInt();
            int hits = jsonObject.get("hits").getAsInt();
            int earnedRuns = jsonObject.get("earnedRuns").getAsInt();
            int homeRuns = jsonObject.get("homeRuns").getAsInt();
            int walks = jsonObject.get("walks").getAsInt();
            int strikeouts = jsonObject.get("strikeouts").getAsInt();

            PitchingStatistic newStat = new PitchingStatisticBuilder().createPitchingStatistic(createdBy, games, wins,
                    saves, losses, inningsPitched, runs, hits, earnedRuns, homeRuns, walks, strikeouts);

            ArrayList<Player> playersOnTeam = database.team.getPlayersOnTeam();
            for (Player player : playersOnTeam){
                if(player.getPlayerId().equals(playerID)){
                    player.addStatistic(newStat);
                    return "Statistic Added";
                }
            }
            res.status(400);
            return new ResponseError("PlayerID not found", playerID);

        }, JsonUtil.json());


        get("/get_all_statistics", (req, res) -> database.team.getTeamStatistics(), JsonUtil.json());

        post("/remove_statistic", (req, res) -> {
            JsonObject jsonObject = new JsonParser().parse(req.body()).getAsJsonObject();
            if(database.getSignedIn() == null){
                return "Error: Not signed in";
            }
            User signedIn = database.getSignedIn();
            String playerID = jsonObject.get("playerID").getAsString();
            UUID statisticID = UUID.fromString(jsonObject.get("statisticID").getAsString());

            if(signedIn.getUserID().equals(database.getAdmin().getUserID())){
                ArrayList<Player> playersOnTeam = database.team.getPlayersOnTeam();
                for (Player player : playersOnTeam){
                    if(player.getPlayerId().equals(playerID)){
                        player.removeStatistic(statisticID);
                        return "Statistic removed";
                    }
                }
                res.status(400);
                return new ResponseError("PlayerID not found", playerID);
            }
            res.status(400);
            return new ResponseError("Admin access denied", signedIn.getUsername());

        }, JsonUtil.json());
    }
}