package design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ObserverPattern {

    static class Observer {
        public void update() {
            System.out.println("Observer: " + this.hashCode() + " updated.");
        }
    }

    static class Publisher {
        List<Observer> observers = new ArrayList<>();

        public void add(Observer observer) {
            System.out.println("Observer: " + observer.hashCode() + " added.");
            observers.add(observer);
        }

        public void remove(Observer observer) {
            System.out.println("Observer: " + observer.hashCode() + " removed.");
            observers.remove(observer);
        }

        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update();
            }
        }
    }

    public static void main(String[] args) {
        var publisher = new Publisher();
        publisher.add(new Observer());
        publisher.add(new Observer());
        publisher.add(new Observer());
        publisher.notifyObservers();
        publisher.remove(publisher.observers.get(0));
        publisher.notifyObservers();
    }


}
