package org.desing.pattern.creational.abstractfactory;

public class Bus implements IVehicle{
    @Override
    public void vehicleVIN() {
        System.out.println("\tVIN: BUS123");
    }

    @Override
    public void vehicleDNI() {
        System.out.println("\tDNI: DNIBUS123");
    }
}
