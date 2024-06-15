package org.example.structural;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public String draw() {
        return "Drawing a red " + decoratedShape.draw();
    }
}
