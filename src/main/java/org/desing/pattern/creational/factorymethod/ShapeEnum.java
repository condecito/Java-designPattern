package org.desing.pattern.creational.factorymethod;

public enum ShapeEnum {
    CIRCLE("CIRCLE"),
    SQUARE("SQUARE"),
    TRIANGLE("TRIANGLE");


    private final String shape;


    ShapeEnum(final String shape) {
        this.shape = shape;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return shape;
    }
}
