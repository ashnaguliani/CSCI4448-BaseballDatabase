package User;

import java.util.UUID;

public class User {
    private final UUID userID;
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email){
        this.userID = UUID.randomUUID();
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public UUID getUserID() {
        return userID;
    }

    public String getEmail() {
        return email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
