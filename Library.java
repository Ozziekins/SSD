import java.util.Arrays;

public class Library {
    String[] books;

    public String[] getBooks() {
        return this.books;
    }

    public void addBook(String book) {
        this.books = Arrays.copyOf(this.books, this.books.length + 1);
        this.books[this.books.length - 1] = book;
    }
}
