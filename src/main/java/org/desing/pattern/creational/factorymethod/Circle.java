package org.desing.pattern.creational.factorymethod;

public class Circle implements IShape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

    @Override
    public void type() {
        System.out.println(ShapeEnum.CIRCLE.toString());
    }
}
