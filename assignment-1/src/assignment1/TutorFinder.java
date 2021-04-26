package assignment1;

import assignment1.factory.*;

public class TutorFinder {
    public static void main(String[] args) {
        String name = "Tasnim";
        String email = "tasnimyellow@hotmail.co.ru";
        UserFactory factory1 = new UserFactory();

        factory1.createUser(UserType.PARENT, name, email);
        factory1.createUser(UserType.TUTOR, name, email);
        factory1.createUser(UserType.ADMIN, name, email);
        System.out.println("3 users were created.");

    }
}
