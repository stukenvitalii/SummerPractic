package org.example.structural;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("Drawing a circle: " + circle.draw());

        Shape square = new Square();
        System.out.println("Drawing a square: " + square.draw());

        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("Drawing a red circle: " + redCircle.draw());

        Shape redSquare = new RedShapeDecorator(new Square());
        System.out.println("Drawing a red square: " + redSquare.draw());
    }
}