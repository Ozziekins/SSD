package handlers;

import assets.*;
import users.Admin;

public class ValidationHandler extends BaseHandler {
    public void handle(Request request) {
        System.out.println("ValidationHandler Triggered");
        // Verify type then cast
        Book book = (Book) request.getParameters().get(0);
        Library library = (Library) request.getParameters().get(1);

        if (!library.isPresent(book)) {
            Admin adminUser = (Admin) request.getSender();
            adminUser.addBook(book, library);
            request.setResponse(true, "Book Added Successfully");
            super.handle(request);
        }
    }

    public boolean bookExists(Library library, Book book) {
        return library.isPresent(book);
    }

    public boolean tutorExists() {
        return true;
    }

    public boolean parentExists() {
        return true;
    }

    public boolean lectureExists() {
        return true;
    }
}
