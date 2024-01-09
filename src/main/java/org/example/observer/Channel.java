package org.example.observer;

import java.util.List;

public interface Channel {

    void addObserver(Observer observer);

    void sendMessage(String message);

    void deleteObserver(Observer observer);
}
