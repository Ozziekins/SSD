import users.*;

public class TutorFinder {
    public static void main(String[] args) {
        String name = "Tasnim";
        String email = "tasnimyellow@hotmail.co.ru";

        IUser user = new User(name, email);

        IUser parentAdmin = new AdminDecorator(new ParentDecorator(user));
        parentAdmin.login();
        System.out.println("Name: " + parentAdmin.getName());
        System.out.println("Email: " + parentAdmin.getEmail());

    }
}
