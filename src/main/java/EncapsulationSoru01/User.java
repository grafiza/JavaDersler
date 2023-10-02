package EncapsulationSoru01;

public class User {

    protected int id;
    protected String userName;
    protected String password;
    protected Boolean active;
    protected Boolean signedIn;

    public User() {
    }

    public User(int id, String userName, String password, Boolean active, Boolean signedIn) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.signedIn = signedIn;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getSignedIn() {
        return signedIn;
    }

    public void setSignedIn(Boolean signedIn) {
        this.signedIn = signedIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }
}
