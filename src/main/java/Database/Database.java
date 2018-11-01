package Database;

import java.util.*;
import Team.Team;
import User.*;

public class Database {
    private ArrayList<Team> teams=new ArrayList<Team>();
    private ArrayList<User> users=new ArrayList<User>();

    public boolean addTeam(String teamName){
        Team newTeam = new Team(teamName);
        return true;
    }

    public boolean addUser(UUID addedBy, String username, String password, String email){
        User newUser = new User(username, password, email);
        users.add(newUser);
        return true;
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

    public ArrayList<Team> getTeams() {
        return teams;
    }
}
