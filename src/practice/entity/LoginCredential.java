package practice.entity;

public class LoginCredential {
    private int id;
    private String username;
    private String password;

    public LoginCredential (int id, String username, String password) {
        this.id = id;
        this.password = password;
        this.username = username;
    };
    public LoginCredential (String username, String password) {
        this.password = password;
        this.username = username;
    };

//    Getters
    public int getId(){ return id;};
    public String getUsername() { return  username;};
    public String getPassword() { return password;};

//      Setters
    public void setId(int id){
        this.id = id;
    };

    public void setUsername (String username) {
        this.username = username;
    };

    public void setPassword (String password){
        this.password = password;
    };
}
