package UserAuthentication;
import User.User;
import Database.Database;

import java.util.ArrayList;

public class UserAuthentication {
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
