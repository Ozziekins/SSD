package users;
import java.util.Random;

public abstract class User {
    protected String role;
    private String name;
    private String email;
    private String id;
    protected Boolean loggedIn = false;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = newID();
    }

    public boolean isLoggedIn() {return  this.loggedIn; }
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getID() {
        return this.id;
    }

    protected String newID() {
        Random rand = new Random();
        double drandom = rand.nextDouble();
        return Double.toString(drandom);
    }

    public void login(boolean status) {
        System.out.println("A user did login.");
        this.loggedIn = status;
    }

    public abstract String getRole();
}
