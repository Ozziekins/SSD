public class TutorUser extends BaseUser{


    public TutorUser(String name, String email) {
        super(name, email);
    }

    @Override
    void login() {
    }

    public void updateProfile() {
        System.out.println("Profile updated");
    }

    public void viewBookings() {

    }

    public void viewDemoRequests() {

    }

    public void acceptDemoRequest() {
        System.out.println("Demo request accepted");
    }
}
