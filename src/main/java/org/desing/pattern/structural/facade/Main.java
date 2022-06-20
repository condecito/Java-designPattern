package org.desing.pattern.structural.facade;

public class Main {


    private static String title = "----Facade Pattern----";
    private static String description = "Descripcion: Fancascade es un patrón de diseño estructural que proporciona una " +
            "interfaz simplificada a una biblioteca, un framework o cualquier otro grupo complejo de clases";
    private static String aplication = "Utilizacion: El patrón Facade intenta solucionar el problema de disponer de " +
            "muchas funcionalicades de un subsistema. Facade  proporciona un atajo a las funciones más utilizadas " +
            "del subsistema que mejor encajan con los requisitos del cliente.";

    public static void main(String[] arg) {
        System.out.println(title + "\n" + description + "\n" + aplication);

        /*
        podriamos llamar al objeto ParkinCarComplexSystem y llamar a cada uno de sus metodos por
        seáradp
         */
        ParkinCarComplexSystem parkinCarComplexSystem = new ParkinCarComplexSystem();
        System.out.println("\tPut Car on Way");
        parkinCarComplexSystem.turnOnCar();
        parkinCarComplexSystem.changeTransmisionToRun();
        parkinCarComplexSystem.quitHandBrake();
        parkinCarComplexSystem.runOnTheCar();
        System.out.println("\tSttoped Car");
        parkinCarComplexSystem.stopCar();
        parkinCarComplexSystem.changeTransmisionToParking();
        parkinCarComplexSystem.putHandBrake();
        parkinCarComplexSystem.turnOff();

        /*
        o simplemente agrupar las funcionalidades en una clase facade que ejecute estos metodos por nosotros
        de manera simplificada
        {llamamos 2 metodos }
         */
        IfacadeParkingCar facadeParkinCar = new ImpFacadeParkinCar();
        System.out.println("\tPut Car on Way");
        facadeParkinCar.runCar();
        System.out.println("\tSttoped Car");
        facadeParkinCar.stopCar();


    }

}
