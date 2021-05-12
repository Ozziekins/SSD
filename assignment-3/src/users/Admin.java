package users;

import assets.*;

public class Admin extends User {

    public Admin(String name, String email) {
        super(name, email);
        this.role = "admin";
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

    public void addBook(Book book, Library library) {
        library.addBook(book);
    }

    public void viewParents() {
        System.out.println("Parents:");
    }

    public void viewTutor() {
        System.out.println("Tutors:");
    }

    public Parent getParent(String parentID) {
        return null;
    }

    public Tutor getTutor(String tutorID) {
        return null;
    }

    public String getRole() { return this.role; }

}
