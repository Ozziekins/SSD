package handlers;

import assets.Parameter;
import users.User;

import java.util.List;

public class Request {
    public User sender;
    public Action action;
    public List<Parameter> parameters;
    public String response;

    public Request(User sender, Action action, List<Parameter> parameters, String response) {
        this.sender = sender;
        this.action = action;
        this.parameters = parameters;
        this.response = response;
    }
}
