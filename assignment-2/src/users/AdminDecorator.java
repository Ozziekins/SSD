package users;

import assets.Library;

public class AdminDecorator extends UserDecorator {

    public AdminDecorator(IUser user) {
        super(user);
        System.out.println("A new admin user has been created!");
    }

    public void login() {
        System.out.println("An admin user did login.");
    }

    public void registerTutor() {
        System.out.println("Tutor registered");
    }

    public void updateTutorProfile() {
        System.out.println("Tutor profile updated");
    }

    public void addBook(String book, Library library) {
        library.addBook(book);
        System.out.println("Book added");
    }

    public void viewParents() {
        System.out.println("Parents:");
    }

    public void viewTutor() {
        System.out.println("Tutors:");
    }

    public ParentDecorator getParent(String parentID) {
        return null;
    }

    public TutorDecorator getTutor(String tutorID) {
        return null;
    }
}
