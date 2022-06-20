package org.desing.pattern.structural.decorator;

public class Main {

    private static String title = "----Decorator Pattern----";
    private static String description = "Descripcion: Decorator es un patrón de diseño estructural que permite añadir" +
            " dinámicamente nuevos comportamientos a objetos colocándolos dentro de objetos especiales que los " +
            "envuelven (_wrappers_).";
    private static String aplication = "Utilizando decoradores puedes envolver objetos innumerables veces, " +
            "ya que los objetos objetivo y los decoradores siguen la misma interfaz. El objeto resultante " +
            "obtendrá un comportamiento de apilado de todos los wrappers.";

    public static void main(String[] arg) {
        System.out.println(title + "\n" + description + "\n" + aplication);

        System.out.println("Basic Gun");
        IGun basicGun =new ImplGun();
        basicGun.shoot();
        System.out.println("Gun Sniper");
        IGun gunSniper=new GunSniperDecorator(new ImplGun());
        gunSniper.shoot();

        System.out.println("Gun Large Sniper");
        IGun largeGunSniper=new GunLargeSniperDecorator(new ImplGun());
        largeGunSniper.shoot();


    }
}
