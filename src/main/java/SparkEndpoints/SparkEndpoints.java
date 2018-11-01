package SparkEndpoints;

import static spark.Spark.*;
import User.*;
import UserAuthentication.UserAuthentication;
import Database.Database;

public class SparkEndpoints {
    private final UserAuthentication userAuthentication;
    private Database database;

    public SparkEndpoints(UserAuthentication userAuthentication, Database database)
    {
        this.userAuthentication = userAuthentication;
        this.database = database;
    }

    public void serve() {
        get("/hello", (req, res) -> "Hello Dudes");
        get("/users", (req, res) -> {
            return this.database.getUsernames();
        });
        get("/login", (req, res) -> {
            String username = req.queryParams("username");
            String password = req.queryParams("password");
            return this.userAuthentication.authenticateUserLogin(database, username, password);
        });
    }
}