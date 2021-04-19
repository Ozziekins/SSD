import java.util.Random;

public abstract class BaseUser {
    private String name;
    private String email;

    public BaseUser(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    protected String getID() {
        Random rand = new Random();
        double drandom = rand.nextDouble();
        return Double.toString(drandom);
    }

    abstract void login();
}
