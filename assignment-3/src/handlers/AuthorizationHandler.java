package handlers;

public class AuthorizationHandler extends BaseHandler {
    public void handle(Request request) {
        System.out.println("AuthorizationHandler Triggered");
        if (request.action.equals(Action.HandleAddBook) && request.sender.getRole().equals("admin")) {
            super.handle(request);
        }

    }
}
