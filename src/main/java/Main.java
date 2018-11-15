import UserAuthentication.UserAuthentication;
import Database.Database;
import SparkEndpoints.SparkEndpoints;

public class Main {
    public static void main(String[] args)
    {
        UserAuthentication userAuthentication = new UserAuthentication();
        Database database = new Database();
        database.addTeam("colorado buffaloes");
        database.addAdmin("ashna", "a_password", "a_email");
        database.addUser("rhea", "r_password", "r_email");

        SparkEndpoints sparkEndpoints = new SparkEndpoints(userAuthentication, database);
        sparkEndpoints.serve();
    }
}