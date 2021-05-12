package handlers;

public class BaseHandler implements Handler {
    private Handler next;

    public void setNext(Handler handler) {
        this.next = handler;
    }

    public Handler getNext() {
        return this.next;
    }

    public void handle(Request request) {
        if (this.next != null) {
            next.handle(request);
        }
    }
}
