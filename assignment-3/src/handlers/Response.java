package handlers;

public class Response {
    private boolean status;
    private String message;

    public Response(Boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public boolean getStatus() { return this.status; }
    public String getMessage() { return this.message; }
}
