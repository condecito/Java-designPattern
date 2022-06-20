package org.desing.pattern.creational.abstractfactory;
//esta fabrica retorna objetos del tipo Vehiculo {Bus}
public class BusBuilder implements IMakeVehicle{
    @Override
    public IVehicle makeVehicle() {
        IVehicle ImpBus=new Bus();
        System.out.println("\tfabricando vehiculo del tipo Bus");
        return  ImpBus;
    }
}
