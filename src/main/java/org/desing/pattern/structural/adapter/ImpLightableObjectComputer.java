package org.desing.pattern.structural.adapter;

public class ImpLightableObjectComputer implements ILightableObject {
    private boolean isOn = false;

    @Override
    public void switchOnOff() {
    this.isOn=!isOn;
    }

    @Override
    public boolean isOn() {
        return this.isOn;
    }
}
