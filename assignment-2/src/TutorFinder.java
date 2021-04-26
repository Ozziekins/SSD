import users.*;

public class TutorFinder {
    public static void main(String[] args) {
        String name = "Tasnim";
        String email = "tasnimyellow@hotmail.co.ru";
        AdminDecorator user = new AdminDecorator(new TutorDecorator(new ParentDecorator(new User(name, email))));
        user.login();
        System.out.println("Name: " + user.getName());
        System.out.println("Email: " + user.getEmail());

    }
}
