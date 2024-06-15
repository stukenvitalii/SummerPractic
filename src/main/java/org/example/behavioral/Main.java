package org.example.behavioral;

public class Main {
    public static void main(String[] args) {
        // Create a ConcreteSubject with initial state = 3
        Subject stockMarket = new Subject(3);

        // Create some ConcreteObservers
        ConcreteObserver investor1 = new ConcreteObserver(stockMarket);
        ConcreteObserver investor2 = new ConcreteObserver(stockMarket);

        // Register the ConcreteObservers with the ConcreteSubject
        stockMarket.attach(investor1);
        stockMarket.attach(investor2);

        // Notify the ConcreteObservers of a state change
        stockMarket.notifyObservers();

        // Set state = 1
        stockMarket.setState(1);

        // Remove an observer
        stockMarket.detach(investor1);

        // Set state = 2
        stockMarket.setState(2);

        // Notify the ConcreteObservers of another state change
        stockMarket.notifyObservers();
    }
}