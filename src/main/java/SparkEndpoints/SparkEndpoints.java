package SparkEndpoints;

import static spark.Spark.*;
import User.*;
import UserAuthentication.UserAuthentication;
import Database.Database;
import JsonUtil.JsonUtil;
import ResponseError.ResponseError;
import com.google.gson.*;
import Player.*;


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
                return new ResponseError("User %s not added", username);
            }
        }, JsonUtil.json());

        post("/add_player", (req, res) -> {
            JsonObject jsonObject = new JsonParser().parse(req.body()).getAsJsonObject();
            String playerID = jsonObject.get("playerID").getAsString();
            return database.team.addPlayer(playerID);
        }, JsonUtil.json());

    }
}