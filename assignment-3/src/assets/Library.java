package assets;

import java.util.List;

public class Library {
    private List<Book> books;

    public List<Book> getBooks() {
        return this.books;
    }

    public Library(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public boolean isPresent(Book book) {
        return this.books.contains(book);
    }
}
