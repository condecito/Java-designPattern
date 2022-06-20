package org.desing.pattern.structural.decorator;

public class GunLargeSniperDecorator extends GunDecorator{
    public GunLargeSniperDecorator(IGun gun) {
        super(gun);
    }

    public void longViewX400(){
        System.out.println("\tLong View X400");
    }
    public void camouflage(){
        System.out.println("\tAdding Camouflage");
    }

    @Override
    public void shoot() {
        super.shoot();
        longViewX400();
        camouflage();
    }
}
