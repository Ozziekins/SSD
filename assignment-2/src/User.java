import java.util.Random;

public class User implements IUser {
    private String name;
    private String email;
    private String id;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.id = newID();
    }

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

    public void login() {
        System.out.println("A base user did login.");
    }
}
