package handlers;

import users.User;

public class AuthenticationHandler extends BaseHandler implements Handler {
    public void handle(Request request) {
        System.out.println("AuthenticationHandler Triggered");
        if (request.sender.isLoggedIn()) {
            super.handle(request);
        } else {
            System.out.println("Authentication not successful");
        }

    }

}
