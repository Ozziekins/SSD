import users.User;

public class AuthorizationHandler extends BaseHandler implements Handler{
    public void handle(Request request) {
        System.out.println("AuthorizationHandler Triggered");
        if(request.action.equals(Action.HandleAddBook) && request.sender.getRole().equals("admin")) {
            super.handle(request);
        }

    }
}