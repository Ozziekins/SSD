package users;

public class TutorUser extends BaseUser{

    private int[] ratings;
    private int averageRating;
    private boolean registered;
    private String[] currentStudents;

    public TutorUser(String name, String email) {
        super(name, email);
        System.out.println("A new tutor user has been created!");
    }

    @Override
    void login() {
    }


    public int getAverageRating() {
        return this.averageRating;
    }

    public int[] getRatings() {
        return this.ratings;
    }

    public void updateProfile() {
        System.out.println("Profile updated");
    }

    public boolean isRegistered() {
        return this.registered;
    }

    public String[] getCurrentStudents() {
        return this.currentStudents;
    }

    public void viewBookings() {
        System.out.println("Bookings:");
    }


    public void viewDemoRequests() {
        System.out.println("DEmo requests:");
    }

    public boolean acceptDemoRequest() {
        System.out.println("Demo request accepted!");
        return true;
    }
}
