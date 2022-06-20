package org.desing.pattern.structural.facade;



/*
Tenemos una clase compleja con muchos metodos
* */
public class ParkinCarComplexSystem {

    public void turnOnCar() {
        System.out.println("\tThe car is ready to run");
    }

    public void turnOff() {
        System.out.println("\tTurn Off Car ");
    }

    public void changeTransmisionToParking() {

        System.out.println("\tPutting on P the car ");
    }

    public void putHandBrake() {
        System.out.println("\tPutting Hand Brake ");
    }

    public void quitHandBrake() {
        System.out.println("\tQuit Hand Brake");
    }

    public void changeTransmisionToRun() {
        System.out.println("\tThe car is now in D ");
    }
    public void runOnTheCar(){
        System.out.println("\tThe car is moving");
    }
    public void stopCar(){
        System.out.println("\tThe car is stopped");
    }

}
