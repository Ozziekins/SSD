package users;

public class ParentDecorator extends UserDecorator {
    private boolean registered;
    private String currentTutor;

    public ParentDecorator(IUser user) {
        super(user);
        System.out.println("A new parent user has been created!");
    }

    public boolean isRegistered() {
        return this.registered;
    }

    public String getCurrentTutor() {
        return this.currentTutor;
    }

    public void login() {
        System.out.println("A parent user did login.");
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

    public TutorDecorator[] filterTutor() {
        return null;
    }

    public TutorDecorator selectTutor() {
        return null;
    }

    public void attendLecture(String lectureID) {
        System.out.println("Attending lecture " + lectureID + " !");
    }
}
