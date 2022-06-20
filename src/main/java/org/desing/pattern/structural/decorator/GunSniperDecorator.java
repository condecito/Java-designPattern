package org.desing.pattern.structural.decorator;

public class GunSniperDecorator extends GunDecorator{

    public GunSniperDecorator(IGun gun) {
        super(gun);
    }
    public void longViewX200(){
        System.out.println("\tLong View X200");
    }
    public void addHandSupport(){
        System.out.println("\tAdding Hand Support");
    }

    @Override
    public void shoot() {
        super.shoot();
        longViewX200();
        addHandSupport();
    }
}
