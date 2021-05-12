package assets;

public class Book extends Parameter{
    private String bookname;

    public Book(String bookname) {
        this.bookname = bookname;
    }
    String getBookname() {
        return bookname;
    }
}
