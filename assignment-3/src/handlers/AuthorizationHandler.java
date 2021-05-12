package handlers;

public class AuthorizationHandler extends BaseHandler {
    public void handle(Request request) {
        System.out.println("AuthorizationHandler Triggered");
        if (request.getAction().equals(Action.HandleAddBook) && request.getSender().getRole().equals("admin")) {
            super.handle(request);
        }

    }
}
