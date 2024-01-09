package org.example.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{

    private final List<User> users = new ArrayList<>();

    @Override
    public void sendMessage(String message, User user) {
        users.stream().filter(usr -> !usr.equals(user))
                .forEach(usr -> usr.receiveMessage(user.getName() + " - to " + usr.getName() + " - : " + message));
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}
