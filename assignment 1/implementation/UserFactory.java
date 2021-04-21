public class UserFactory {
    enum UserType {
        PARENT, TUTOR, ADMIN
    }

    protected BaseUser createUser(UserType userType, String name, String email) {
        BaseUser nuser = null;
        switch (userType) {
        case PARENT:
            nuser = new ParentUser(name, email);
            break;
        case TUTOR:
            nuser = new TutorUser(name, email);
            break;
        case ADMIN:
            nuser = new AdminUser(name, email);
            break;
        default:
            break;
        }
        return nuser;
    }
}
