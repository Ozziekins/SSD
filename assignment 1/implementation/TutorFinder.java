import users;

public class TutorFinder {
    public static void main(String[] args) {
        String name = "Tasnim";
        String email = "tasnimyellow@hotmail.co.ru";
        UserFactory factory1 = new UserFactory();

        BaseUser user1 = factory1.createUser(UserType.PARENT, name, email);
        BaseUser user2 = factory1.createUser(UserType.TUTOR, name, email);
        BaseUser user3 = factory1.createUser(UserType.ADMIN, name, email);
    }
}
