package org.example.observer;

import org.example.observer.impl.ChannelImpl;
import org.example.observer.impl.ObserverImpl;

public class Main {

    public static void main(String[] args) {
        Observer observer1 = new ObserverImpl("Sina");
        Observer observer2 = new ObserverImpl("Arezoo");
        Observer observer3 = new ObserverImpl("Sanaz");

        Channel channel = new ChannelImpl();
        channel.addObserver(observer1);
        channel.addObserver(observer2);

        channel.sendMessage("Hi");

        channel.deleteObserver(observer1);
        channel.addObserver(observer3);
        channel.sendMessage("Is anybody here?");

    }


}
