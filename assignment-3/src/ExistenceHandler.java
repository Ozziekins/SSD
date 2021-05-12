import assets.Book;
import assets.Library;
import assets.Parameter;
import users.Admin;

public class ExistenceHandler extends BaseHandler implements Handler{
    public void handle(Request request) {
        System.out.println("ExistenceHandler Triggered");
        //Verify type then cast
        Book book = (Book)request.parameters.get(0);
        Library library = (Library) request.parameters.get(1);

        if( !library.isPresent(book)){
            Admin adminUser = (Admin)request.sender;
            adminUser.addBook(book, library);
            request.response = "Book Added Successfully";
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
