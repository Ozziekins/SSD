package handlers;

import users.User;

import java.util.List;

public class Request {
    public User sender;
    public Action action;
    public List<Object> parameters;
    public String response;

    public Request(User sender, Action action, List<Object> parameters, String response) {
        this.sender = sender;
        this.action = action;
        this.parameters = parameters;
        this.response = response;
    }
}
