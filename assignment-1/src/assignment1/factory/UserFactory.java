package assignment1.factory;

import assignment1.users.*;

public class UserFactory {
    public BaseUser createUser(UserType userType, String name, String email) {
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
