package User;

import java.util.UUID;

public class User {
    private final UUID userID;
    private String username;
    private String password;
    private String email;

    /**
     * Constructor
     * @param username - username
     * @param password - password
     * @param email - email
     */
    public User(String username, String password, String email){
        this.userID = UUID.randomUUID();
        this.username = username;
        this.password = password;
        this.email = email;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return userID
     */
    public UUID getUserID() {
        return userID;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param username - username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @param password - password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @param email - email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
