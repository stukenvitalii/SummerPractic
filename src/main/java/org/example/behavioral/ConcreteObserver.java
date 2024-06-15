package org.example.behavioral;


public class ConcreteObserver implements Observer {
    private final Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("ConcreteObserver received update: " + subject.getState());
    }
}