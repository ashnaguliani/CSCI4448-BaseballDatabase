package User;

public class Admin extends User{
    private final boolean adminStatus;

    Admin(String username, String password, String email){
        super(username, password, email);
        adminStatus = true;
    }

}
