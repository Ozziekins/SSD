package handlers;

public class AuthenticationHandler extends BaseHandler {
    public void handle(Request request) {
        System.out.println("AuthenticationHandler Triggered");
        if (request.getSender().isLoggedIn()) {
            super.handle(request);
        } else {
            request.setResponse(false, "Authentication not successful");
        }

    }

}
