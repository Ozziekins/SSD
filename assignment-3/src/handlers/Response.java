package handlers;
import users.User;

public class Response {
    private boolean status;
    private String message;

    public Response(Boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    boolean getStatus() { return this.status; }
    String getMessage() { return this.message; }
}
