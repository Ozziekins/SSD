package users;

import assets.Library;

public class AdminUser extends UserDecorator {

    public AdminUser(IUser user) {
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

    public ParentUser getParent(String parentID) {
        return null;
    }

    public TutorUser getTutor(String tutorID) {
        return null;
    }
}