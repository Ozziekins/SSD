
public interface Handler {
    void setNext(Handler h);
    void handle(Request request);
}
