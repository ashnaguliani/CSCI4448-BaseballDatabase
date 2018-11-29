package UserAuthentication;
import User.User;
import Database.Database;

import java.util.ArrayList;

public class UserAuthentication {
    /**
     * @param database - the database
     * @param username - the username
     * @param password - the password
     * @return whether the user was authenticated
     */
    public boolean authenticateUserLogin(Database database, String username, String password){
        ArrayList<User> usersDatabase = database.getUsers();
        for (User user : usersDatabase) {
            if(user.getUsername().equals(username)){
                if(user.getPassword().equals(password)){
                    return true;
                }
            }
        }return false;
    }
}
