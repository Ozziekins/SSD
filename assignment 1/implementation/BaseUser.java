import java.util.Random;

abstract class BaseUser {
    private String name;
    private String email;
    private String id;

    public BaseUser(String name, String email) {
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

    abstract void login();
}
