package EncapsulationSoru01;

public class User {

    private int id;
    private String userName;
    private String password;
    private Boolean active;
    private Boolean signedIn;

    public User() {
    }

    public User(int id, String userName, String password, Boolean active, Boolean signedIn) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.active = active;
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
