package org.desing.pattern.structural.decorator;

/*
Decorador principal que permite agregar nuevas funcionalidades al codigo
 */
public class GunDecorator implements IGun {
    private final IGun gun;

    public GunDecorator(IGun gun) {
        this.gun = gun;
    }

    @Override
    public void shoot() {
        gun.shoot();
    }
}
