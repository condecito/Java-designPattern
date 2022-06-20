package org.desing.pattern.structural.adapter;


/*
* Clase no compatible con nuestras clases Bases,
* */
public class NonCompatibleClassOrLegancyObject {

    // 0 is false 1 is true
    private int isTurnOn=0;

    public int objectIsOn(){
        return  this.isTurnOn;
    }

    public void objectTurnOff(){
        this.isTurnOn=0;
    }

    public  void objectTurnOn(){
        this.isTurnOn=1;
    }

}
