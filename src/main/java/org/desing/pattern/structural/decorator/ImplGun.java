package org.desing.pattern.structural.decorator;

public class ImplGun implements IGun{

    @Override
    public void shoot() {
        System.out.println("\tShooting Gun");
    }
    public void addLongViewX100(){
        System.out.println("\tAdding LongView X100m");
    }
}
