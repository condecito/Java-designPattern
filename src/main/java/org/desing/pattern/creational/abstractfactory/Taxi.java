package org.desing.pattern.creational.abstractfactory;

public class Taxi implements IVehicle{
    @Override
    public void vehicleVIN() {
        System.out.println("\tVIN: Taxi123");
    }

    @Override
    public void vehicleDNI() {
        System.out.println("\tDNI: DNITAXI123");
    }
}
