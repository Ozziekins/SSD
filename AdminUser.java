public class AdminUser extends BaseUser {

    public AdminUser(String name, String email) {
        super(name, email);
    }

    @Override
    void login() {

    }

    public void registerTutor() {
        System.out.println("Tutor registered");
    }

    public void updateTutorProfile() {
        System.out.println("Tutor profile updated");
    }

    public void addBook() {
        System.out.println("Book added");
    }

    public void viewParents() {

    }

    public void viewTutor() {

    }

    public void getParents() {

    }

    public void getTutor() {

    }
}
