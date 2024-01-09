package org.example.observer.impl;

import lombok.Getter;
import lombok.Setter;
import org.example.observer.Observer;

@Getter
@Setter
public class ObserverImpl implements Observer {

    private String name;

    @Override
    public void update(String message) {
        System.out.println(name + ": " + message);
    }

    public ObserverImpl(String name) {
        this.name = name;
    }
}
