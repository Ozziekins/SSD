import assets.Book;
import assets.Library;
import assets.Parameter;
import users.*;
import handlers.*;

import java.util.ArrayList;
import java.util.List;

public class TutorFinder {
    public static void main(String[] args) {
        User admin1 = new Admin("Eugene", "eugene@gmail.com");
        admin1.login(true);
        // User tut1 = new Tutor("john", "johne@gmail.com");
        // tut1.login(true);

        Handler h1 = new AuthenticationHandler();
        Handler h2 = new AuthorizationHandler();
        Handler h3 = new ExistenceHandler();

        h1.setNext(h2);
        h2.setNext(h3);

        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Toom and Jerry"));
        Library library = new Library(books);

        Book newBook = new Book("Living rivers");
        List<Parameter> parameters = new ArrayList<>();
        parameters.add(newBook);
        parameters.add(library);

        String response = "";
        Request request = new Request(admin1, Action.HandleAddBook, parameters, response);
        h1.handle(request);
        System.out.println(request.response);
    }
}
