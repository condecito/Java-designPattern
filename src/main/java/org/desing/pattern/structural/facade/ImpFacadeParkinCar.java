package org.desing.pattern.structural.facade;
/*
Nuestra clase fachada nos proveera solo los principales acciones para el aparcamiento de un carro

 */
public class ImpFacadeParkinCar implements  IfacadeParkingCar{
    private ParkinCarComplexSystem parkinCarComplexSystem =new ParkinCarComplexSystem();

    @Override
    public void runCar() {
        parkinCarComplexSystem.turnOnCar();
        parkinCarComplexSystem.changeTransmisionToRun();
        parkinCarComplexSystem.quitHandBrake();
        parkinCarComplexSystem.runOnTheCar();

    }

    @Override
    public void stopCar() {
        parkinCarComplexSystem.stopCar();
        parkinCarComplexSystem.changeTransmisionToParking();
        parkinCarComplexSystem.putHandBrake();
        parkinCarComplexSystem.turnOff();

    }
}
