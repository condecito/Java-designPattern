package org.desing.pattern.creational.factorymethod;

public class ShapeFactory {
//factoria principal donde se crean los objetos
    public IShape getShape(final String shapeType) {
        if (shapeType == ShapeEnum.CIRCLE.toString()) {
            return new Circle();
        } else if (shapeType == ShapeEnum.SQUARE.toString()) {
            return new Square();
        } else {
            return null;
        }

    }

}
