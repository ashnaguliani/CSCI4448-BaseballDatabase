package Database;

import java.util.*;
import Team.Team;
import User.*;

public class Database {
    public Team team;
    private ArrayList<User> users=new ArrayList<User>();
    private User admin = null;
    private User signedIn = null;

    public void setSignedIn(User user){
        this.signedIn = user;
    }

    public User getSignedIn() { return this.signedIn;}

    public boolean addTeam(String teamName){
        this.team = new Team(teamName);
        return true;
    }

    public Team getTeam(){
        return this.team;
    }

    public boolean addUser(String username, String password, String email){
        for (User user : users){
            if(user.getUsername().equals(username)) return false;
        }
        User newUser = new User(username, password, email);
        users.add(newUser);
        return true;
    }

    public User addAdmin(String username, String password, String email){
        Admin newUser = new Admin(username, password, email);
        admin = newUser;
        users.add(newUser);
        return newUser;
    }

    public boolean removeUser(String usernameToRemove){
        int indexToRemove = -1;
        for (int counter = 0; counter < users.size(); counter++) {
            if(users.get(counter).getUsername().equals(usernameToRemove)){
                indexToRemove = counter;
            }
        }
        if(indexToRemove != -1) {
            users.remove(indexToRemove);
            return true;
        }else return false;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public ArrayList<String> getUsernames() {
        ArrayList<String> usernames = new ArrayList<String>();
        for (User user : users){
            usernames.add(user.getUsername());
        }
        return usernames;
    }

    public User getUser(String name){
        for (User user : users){
            if (user.getUsername().equals(name))
                return user;
        }
        return null;
    }

    public User getAdmin(){
        return admin;
    }

}
