public abstract class UserDecorator implements IUser {
    private IUser user;

    public UserDecorator(IUser user) {
        this.user = user;
    }

    public String getName() {
        return user.getName();
    }

    public String getEmail() {
        return user.getEmail();
    }

    public String getID() {
        return user.getID();
    }
}
