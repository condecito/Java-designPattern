package org.desing.pattern.structural.adapter;

public class AdapterILightableObjectWithNonCompatibleClass implements ILightableObject {

    private NonCompatibleClassOrLegancyObject nonCompatibleClassOrLegancyObject = new NonCompatibleClassOrLegancyObject();

    @Override
    public void switchOnOff() {
        if (nonCompatibleClassOrLegancyObject.objectIsOn()==1)
            this.nonCompatibleClassOrLegancyObject.objectTurnOff();
        else
            this.nonCompatibleClassOrLegancyObject.objectTurnOn();
    }

    @Override
    public boolean isOn() {
        if (nonCompatibleClassOrLegancyObject.objectIsOn()==1)
           return true;
        else
           return false;
    }
}
