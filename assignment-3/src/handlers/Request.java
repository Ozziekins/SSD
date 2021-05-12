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

    User getSender() {
        return this.sender;
    }

    Action getAction() {
        return this.action;
    }

    List<Object> getParameters() {
        return this.parameters;
    }

    Response getResponse() {
        return this.response;
    }

    void setResponse(Response response) {
        this.response = response;
    }

}
