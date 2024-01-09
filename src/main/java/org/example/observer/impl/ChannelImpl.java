package org.example.observer.impl;

import org.example.observer.Channel;
import org.example.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ChannelImpl implements Channel {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void sendMessage(String message) {
        observers.forEach(observer -> observer.update(message));
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

}
