import UserAuthentication.UserAuthentication;
import Database.Database;
import SparkEndpoints.SparkEndpoints;

import java.util.UUID;

public class Main {
    public static void main(String[] args)
    {
        UserAuthentication userAuthentication = new UserAuthentication();
        Database database = new Database();
        SparkEndpoints sparkEndpoints = new SparkEndpoints(userAuthentication, database);
        sparkEndpoints.serve();
    }
}