package assignment1.assets;
import java.util.Arrays;

public class Library {
    private String[] books;

    public String[] getBooks() {
        return this.books;
    }

    public void addBook(String book) {
        this.books = Arrays.copyOf(this.books, this.books.length + 1);
        this.books[this.books.length - 1] = book;
    }
}
