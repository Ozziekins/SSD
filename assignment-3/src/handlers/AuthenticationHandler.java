package handlers;

public class AuthenticationHandler extends BaseHandler {
    public void handle(Request request) {
        System.out.println("AuthenticationHandler Triggered");
        if (request.sender.isLoggedIn()) {
            super.handle(request);
        } else {
            System.out.println("Authentication not successful");
        }

    }

}
