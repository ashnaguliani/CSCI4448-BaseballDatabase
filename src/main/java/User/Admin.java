package User;

public class Admin extends User{
    private final boolean adminStatus;

    /**
     * Constructor
     * @param username - username
     * @param password - password
     * @param email - email
     */
    public Admin(String username, String password, String email){
        super(username, password, email);
        adminStatus = true;
    }

}
