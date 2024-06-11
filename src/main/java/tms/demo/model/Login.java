package tms.demo.model;

public class Login {


    private String username;
    private String password;
    // Other user attributes
    
    // Constructors
    public Login() {
    }

    public Login(Long id, String username, String password) {
     
        this.username = username;
        this.password = password;
        // Set other attributes
    }
    
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
