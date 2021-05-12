package users;

public class Tutor extends User {

    private int[] ratings;
    private int averageRating;
    private boolean registered;
    private String[] currentStudents;

    public Tutor(String name, String email) {
        super(name, email);
        this.role = "tutor";
    }

    public void login() {
        System.out.println("A tutor user did login.");
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

    public String getRole() { return this.role; }
}
