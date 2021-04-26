package assignment1.users;
public class ParentUser extends BaseUser{

    private boolean registered;
    private String currentTutor;

    public ParentUser(String name, String email) {
        super(name, email);
        System.out.println("A new parent user has been created!");
    }

    public boolean isRegistered() {
        return this.registered;
    }

    public String getCurrentTutor() {
        return this.currentTutor;
    }

    @Override
    void login() {
    }

    public void viewTutors() {
        System.out.println("Parents:");
    }

    public void requestDemo() {
        System.out.println("Demo requested!");
    }

    public void bookTutor(String tutorID) {
        System.out.println("You have booked " + tutorID + " !");
    }

    public void rateTutor(String tutorID) {
        System.out.println("You have rated " + tutorID + " !");
    }

    public void viewBooks() {
        System.out.println("Books:");
    }

    public TutorUser[] filterTutor() {
        return null;
    }

    public TutorUser selectTutor() {
        return null;
    }

    public void attendLecture(String lectureID) {
        System.out.println("Attending lecture " + lectureID + " !");
    }
}
