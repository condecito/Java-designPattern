package org.desing.pattern.creational.factorymethod;

public class Square implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }

    @Override
    public void type() {
        System.out.println(ShapeEnum.SQUARE.toString());
    }
}
