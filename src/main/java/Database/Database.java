package Database;

import java.util.*;
import Team.Team;
import User.*;

/**
 *
 */
public class Database {
    /**
     * The team for which stats will be logged
     */
    public Team team;
    /**
     *
     */
    private ArrayList<User> users=new ArrayList<User>();
    /**
     * Who the admin is of the database
     */
    private User admin = null;
    /**
     * Who the current signed in user is
     */
    private User signedIn = null;

    /**
     * @param user the user to set as signed in
     */
    public void setSignedIn(User user){
        this.signedIn = user;
    }

    /**
     * @return the current signed in user
     */
    public User getSignedIn() { return this.signedIn;}

    /**
     * @param teamName the name of the team to be added
     */
    public void addTeam(String teamName){
        this.team = new Team(teamName);
    }

    /**
     * @return the current team
     */
    public Team getTeam(){
        return this.team;
    }

    /**
     * @param username the username of the user to be added
     * @param password the user's preferred password
     * @param email the user's preferred email
     * @return if user was added successfully
     */
    public boolean addUser(String username, String password, String email){
        for (User user : users){
            if(user.getUsername().equals(username)) return false;
        }
        User newUser = new User(username, password, email);
        users.add(newUser);
        return true;
    }

    /**
     * @param username the username of the user to be added
     * @param password the user's preferred password
     * @param email the user's preferred email
     */
    public void addAdmin(String username, String password, String email){
        Admin newUser = new Admin(username, password, email);
        admin = newUser;
        users.add(newUser);
    }

    /**
     * @return a list of all users
     */
    public ArrayList<User> getUsers() {
        return users;
    }

    /**
     * @param name username of the user to be found
     * @return the user found
     */
    public User getUser(String name){
        for (User user : users){
            if (user.getUsername().equals(name))
                return user;
        }
        return null;
    }

    /**
     * @return who the admin is of the database
     */
    public User getAdmin(){
        return admin;
    }

}
