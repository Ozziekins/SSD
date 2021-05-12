package handlers;
import users.User;

import java.util.List;

public class Request {
    private User sender;
    private Action action;
    private List<Object> parameters;
    private Response response;

    public Request(User sender, Action action, List<Object> parameters) {
        this.sender = sender;
        this.action = action;
        this.parameters = parameters;
    }

    public User getSender() {
        return this.sender;
    }

    public Action getAction() {
        return this.action;
    }

    public List<Object> getParameters() {
        return this.parameters;
    }

    public Response getResponse() {
        return this.response;
    }

    public void setResponse(boolean status, String message) {
        this.response = new Response(status, message);
    }

}
